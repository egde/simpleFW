package de.kazkazi.simple;

import java.lang.reflect.Method;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;

public class MainApp {

	public static void main(String[] args) {
		MethodManager methodManager = new MethodManager();
		startUp(methodManager);
		TCPServer tcpServer = new TCPServer(methodManager);
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