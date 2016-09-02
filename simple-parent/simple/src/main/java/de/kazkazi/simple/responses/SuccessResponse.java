package de.kazkazi.simple.responses;

public class SuccessResponse extends Response {

	private Object result;
	
	public SuccessResponse(Object result) {
		super();
		this.result = result;		
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
