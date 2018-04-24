package com.exceptions.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
	@ExceptionHandler(FoodOverdoseException.class)
	public ErrorResponse handleFoodOverdoseException(final Throwable ex) {
		return new ErrorResponse(HttpStatus.I_AM_A_TEAPOT.value(), HttpStatus.I_AM_A_TEAPOT.getReasonPhrase(),
				ex.getMessage());
	}

	@ExceptionHandler(GlobalException.class)
	public ResponseEntity<Object> handleIOException(final GlobalException ex, WebRequest request) {
		return handleExceptionInternal(ex,
				new ErrorResponse(ex.getStatus().value(), ex.getStatus().getReasonPhrase(), ex.getMessage()),
				new HttpHeaders(), ex.getStatus(), request);
	}
}
