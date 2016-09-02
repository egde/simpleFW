package de.kazkazi.simple.responses;

import java.util.UUID;

public abstract class Response {

	private UUID correlationId;
	private int code;

	public Response() {
		super();
		this.correlationId = UUID.randomUUID();
	}

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public UUID getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(UUID correlationId) {
		this.correlationId = correlationId;
	}

}