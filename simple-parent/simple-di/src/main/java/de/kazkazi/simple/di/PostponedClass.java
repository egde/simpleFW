package de.kazkazi.simple.di;

import java.util.ArrayList;
import java.util.List;

/**
 * Collects a Class that was not able to be constructed as there was one or more singleton missing
 * @author egde
 *
 */
public class PostponedClass {

	private Class<?> clazz;
	private List<String> requiredSingletonIDs;
	
	public PostponedClass(Class<?> clazz) {
		this.clazz = clazz;
		requiredSingletonIDs = new ArrayList<String>();
	}
	
	public Class<?> getClazz() {
		return clazz;
	}
	
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}

	public List<String> getRequiredSingletonIDs() {
		return requiredSingletonIDs;
	}

	public void addRequiredSingletonID(String requiredSingletonID) {
		this.requiredSingletonIDs.add(requiredSingletonID);
	}
	
	public boolean removeRequiredSingletonID(String requiredSingletonID) {
		return this.requiredSingletonIDs.remove(requiredSingletonID);
	}
	
}
