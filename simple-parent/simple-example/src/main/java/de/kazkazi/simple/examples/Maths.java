package de.kazkazi.simple.examples;

import de.kazkazi.simple.lib.annotations.Endpoint;

public class Maths {

	@Endpoint
	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	@Endpoint
	public Integer subtract(Integer a, Integer b) {
		return a-b;
	}
}
