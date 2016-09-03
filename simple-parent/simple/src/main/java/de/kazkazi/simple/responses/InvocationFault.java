package de.kazkazi.simple.responses;

public class InvocationFault extends Fault {

	private Exception details;
	
	public InvocationFault(String message, Exception e) {
		super();
		this.setMessage("Invocation Fault: "+message);
		this.setDetails(e);
	}

	public Exception getDetails() {
		return details;
	}

	public void setDetails(Exception details) {
		this.details = details;
	}
}
