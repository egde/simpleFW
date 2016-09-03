package de.kazkazi.simple;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import de.kazkazi.simple.responses.Fault;
import de.kazkazi.simple.responses.InvocationFault;
import de.kazkazi.simple.responses.MethodNotRegisteredFault;
import de.kazkazi.simple.responses.SuccessResponse;

@Singleton
public class MethodManager {
	
	private ConcurrentHashMap<String, Method> methodList;
	
	private static Logger logger = LoggerFactory.getLogger(MethodManager.class);
	
	public MethodManager() {
		methodList = new ConcurrentHashMap<String, Method>();
	}
	
	public void addMethod(Method a) {
		String registrationName = a.getDeclaringClass().getCanonicalName()+"."+a.getName();
		logger.info(String.format("Adding method '%s'", registrationName));
		methodList.put(registrationName, a);
	}
	
	public String invoke(String methodName, String json) {
		Gson gson = new Gson();
		Method method = methodList.get(methodName);
		if (method == null) {
			return gson.toJson(new MethodNotRegisteredFault(methodName));
		}
		
		Class<?>[] parameterTypes = method.getParameterTypes();
		Object result = null;
		try {
			if (parameterTypes.length == 0) {
				result = method.invoke(null);
			} else if (parameterTypes.length == 1) {
				Object inputObject = gson.fromJson(json, parameterTypes[0]);
				result = method.invoke(inputObject);
			} else if (parameterTypes.length > 1) {
				JsonParser jsonParser = new JsonParser();
				JsonElement element = jsonParser.parse(json);
				JsonObject jsonObject = element.getAsJsonObject();
				Set<Entry<String, JsonElement>> entrySet = jsonObject.entrySet();
				int i = 0;
				Object[] inputValues = new Object[parameterTypes.length];
				for (Entry<String, JsonElement> entry : entrySet) {
					inputValues[i] = gson.fromJson(entry.getValue(), parameterTypes[i]);
					i++;
				}
				result = method.invoke(inputValues);
			}
		} catch (Exception e) {
			String message = String.format("Error invoking method '%s'", methodName);
			logger.error(message, e);
			return gson.toJson(new InvocationFault(message, e));
		}
		
		return gson.toJson(new SuccessResponse(result));
	}

	public String listMethods() {
		Gson gson = new Gson();
		ArrayList<String> methodNameList = new ArrayList<String>();
		for (String key :methodList.keySet()) {
			methodNameList.add(key);
		}
		return gson.toJson(new SuccessResponse(methodNameList));
	}
	
}
