package de.kazkazi.simple.examples;

import de.kazkazi.simple.lib.annotations.Endpoint;

public class Maths {

	@Endpoint
	public Number add(Number  a, Number b) {
		return a.doubleValue()+b.doubleValue();
	}
	
	@Endpoint
	public Number subtract(Number a, Number b) {
		return a.doubleValue()-b.doubleValue();
	}
}
