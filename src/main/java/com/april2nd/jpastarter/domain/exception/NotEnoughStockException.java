package com.april2nd.jpastarter.domain.exception;

public class NotEnoughStockException extends RuntimeException {
	
	public NotEnoughStockException() {
		super();
	}
	
	public NotEnoughStockException(String message) {
		super(message);
	}
	
	public NotEnoughStockException(String message, Throwable cause) {
		super(message, cause);
	}

}
