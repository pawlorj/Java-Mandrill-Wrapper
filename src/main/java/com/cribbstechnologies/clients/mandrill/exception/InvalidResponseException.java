package com.cribbstechnologies.clients.mandrill.exception;

public class InvalidResponseException extends Throwable {

	private static final long serialVersionUID = 1L;

	public InvalidResponseException(String message, Throwable t) {
		super(message, t);
	}
	
	public InvalidResponseException(String message) {
		super(message);
	}
}
