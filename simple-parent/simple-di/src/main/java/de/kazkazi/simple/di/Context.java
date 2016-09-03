package de.kazkazi.simple.di;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Context {

	private ConcurrentHashMap<String, Object> singletons;
	private String packageContext;
	private static Logger logger = LoggerFactory.getLogger(Context.class);
	
	public Context() {
		this("");
	}
	
	public Context(String packageContext) {
		this.packageContext = packageContext;
		singletons = new ConcurrentHashMap<>();
	}
	
	public void init() throws ReflectiveOperationException {
		Reflections reflections = new Reflections(packageContext);
		Set<Class<?>> singletonAnnotated = reflections.getTypesAnnotatedWith(Singleton.class);
		constructSingletons(singletonAnnotated);
	}

	private void constructSingletons(Set<Class<?>> singletonAnnotated) throws ReflectiveOperationException {
		List<PostponedClass> laterConstruction = new LinkedList<PostponedClass>();
		
		for (Class<?> singletonClass : singletonAnnotated) {
			String singletonId = detSingletonId(singletonClass);
			
			logger.info(String.format("Constructing %s as singleton", singletonId));
			Map<Method, Object> dependencies = handleDependencies(laterConstruction, singletonClass, singletonId, false, null);
			instantiate(singletonClass, singletonId, dependencies);
		}
		boolean isCyclic = checkCylic(laterConstruction);
		while (! laterConstruction.isEmpty() && !isCyclic) {
			for (PostponedClass item : laterConstruction) {
				
				String singletonId = detSingletonId(item.getClazz());
				
				logger.info(String.format("Constructing %s as singleton", singletonId));
				Map<Method, Object> dependencies = handleDependencies(laterConstruction, item.getClazz(), singletonId, true, item);
				instantiate(item.getClazz(), singletonId, dependencies);
			}
			
		}
	}

	private boolean checkCylic(List<PostponedClass> laterConstruction) {
		return false;
	}

	private void instantiate(Class<?> singletonClass, String singletonId, Map<Method, Object> dependencies)
			throws InvocationTargetException, ReflectiveOperationException {
		if (dependencies != null) {
			try {
				Object newInstance = singletonClass.newInstance();
				for (Entry<Method, Object> dependency : dependencies.entrySet()) {
					dependency.getKey().invoke(newInstance, dependency.getValue());
				}
				singletons.put(singletonId, newInstance);
			} catch (InstantiationException | IllegalAccessException e) {
				logger.error(String.format("Error constructing singleton %s", singletonId), e);
				throw e;
			}
		}
	}

	private String detSingletonId(Class<?> singletonClass) {
		String singletonId =  detQualifiedName(singletonClass);
		
		//check if a singleton with a given id already exists
		if (singletons.containsKey(singletonId)) {
			throw new IllegalArgumentException(String.format("Singleton with the id %s already exists", singletonId));
		}
		return singletonId;
	}

	private Map<Method, Object> handleDependencies(List<PostponedClass> laterConstruction, Class<?> singletonClass,
			String singletonId, boolean isInLaterContruction, PostponedClass postponedClass) {
		if (!isInLaterContruction) {
			postponedClass = new PostponedClass(singletonClass);
		}
		postponedClass.getRequiredSingletonIDs().clear();
		
		Map<Method, Object> dependencies = new LinkedHashMap<Method, Object>();
		Method[] methods = singletonClass.getDeclaredMethods();
		for (Method method : methods) {
			Inject[] injects = method.getAnnotationsByType(Inject.class);
			if (injects.length == 0) {
				continue;
			}
			
			if (!method.getName().startsWith("set")) {
				throw new IllegalArgumentException(
						String.format("Error constructing singleton %s: The @inject may only be used with setters.", singletonId));
			}
			if (method.getParameterTypes().length != 1) {
				throw new IllegalArgumentException(
						String.format("Error constructing singleton %s: The @inject may only be used with setters with a single parameter.", singletonId));
			}
			
			Class<?> parameterType = method.getParameterTypes()[0];
			String singletonIdToSearchFor = detQualifiedName(parameterType);
			Object requiredSingleton = singletons.get(singletonIdToSearchFor);
			if (requiredSingleton != null) {
				dependencies.put(method, requiredSingleton);
			} else {
				logger.info(String.format("Postponing the construction of %s", singletonId));
				postponedClass.addRequiredSingletonID(singletonIdToSearchFor);
			}
		}
		
		Map<Method, Object> result;
		if (postponedClass.getRequiredSingletonIDs().size() > 0) {
			if (! isInLaterContruction) {
				laterConstruction.add(postponedClass);
			}
			result = null;
		} else {
			if (! isInLaterContruction) {
				postponedClass = null;
			} else {
				laterConstruction.remove(postponedClass);
			}
			result = dependencies;
		}
		return result;
	}

	private String detQualifiedName(Class<?> clazz) {
		return clazz.getCanonicalName();
	}
	
	public Object getSingleton(String singletonId) {
		if ( !singletons.containsKey(singletonId) ) {
			throw new IllegalArgumentException(String.format("Singleton with the id %s is not available in this context.", singletonId));
		}
		return this.singletons.get(singletonId);
	}
}
