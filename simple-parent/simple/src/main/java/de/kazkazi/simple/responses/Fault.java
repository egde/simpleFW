package de.kazkazi.simple.responses;


public abstract class Fault extends Response{

	private String message;
	
	public Fault() {
		super();
		setCode(1);
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
