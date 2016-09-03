package de.kazkazi.simple;

import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kazkazi.simple.di.Context;

public class MainApp {

	private static Logger logger = LoggerFactory.getLogger(MainApp.class);
	
	public static void main(String[] args) {
		Context context = new Context("de.kazkazi");
		try {
			context.init();
		} catch (ReflectiveOperationException e) {
			logger.error("Startup failed:", e);
		}
		MethodManager methodManager = (MethodManager) context.getSingleton(MethodManager.class);
		startUp(methodManager);
		TCPServer tcpServer = (TCPServer) context.getSingleton(TCPServer.class);
		tcpServer.start();		
	}

	private static void startUp(MethodManager methodManager) {
		Reflections reflections = new Reflections("", new MethodAnnotationsScanner());
		Set<Method> endpoints = reflections.getMethodsAnnotatedWith(de.kazkazi.simple.lib.annotations.Endpoint.class);
		
		for (Method endpoint : endpoints) {
			methodManager.addMethod(endpoint);
		}
	}
}