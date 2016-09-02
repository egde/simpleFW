package de.kazkazi.simple.responses;

public class MethodNotRegisteredFault extends Fault {

	public MethodNotRegisteredFault(String methodName) {
		super();
		this.setMessage(String.format("Method '%s' is not registered.", methodName));
	}
}
