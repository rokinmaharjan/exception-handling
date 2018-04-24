package com.exceptions.exception;

public class FoodOverdoseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7432634915991830748L;
	
	
	public FoodOverdoseException(String message) {
		super(message);
	}

	public FoodOverdoseException(String message, Throwable ex) {
		super(message, ex);
	}
	
}
