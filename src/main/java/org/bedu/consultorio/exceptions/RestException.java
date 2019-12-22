package org.bedu.consultorio.exceptions;

public class RestException extends RuntimeException{
	
	public RestException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestException(String message) {
		super(message);
	}
	
}
