package com.exceptions.exception;

import org.springframework.http.HttpStatus;

public class GlobalException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7330625987985460851L;

	private String message;
	private HttpStatus status;

	public GlobalException(String message) {
		super();
		this.message = message;
	}

	public GlobalException(HttpStatus status) {
		super();
		this.status = status;
	}

	public GlobalException(String message, HttpStatus status) {
		this.message = message;
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
