package com.exceptions.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exceptions.exception.GlobalException;
import com.exceptions.exception.FoodOverdoseException;

@RestController
@RequestMapping("/food")
public class FoodController {

	/**
	 * <p>
	 * This method demonstrates a type of exception handling by creating separate
	 * exception handlers for each exception.
	 * </p>
	 * 
	 * @throws FoodOverdoseException
	 */
	@GetMapping("/overdose")
	public String s() {
		throw new FoodOverdoseException("Food overdose");
	}

	/**
	 * <p>
	 * This method demonstrates a type of exception handling in which every kind of
	 * exception is handled by a single exception handler.
	 * </p>
	 * 
	 * @throws GlobalException
	 */
	@GetMapping("/global")
	public String throwException() {
		throw new GlobalException("I handle all kinds of exceptions", HttpStatus.SEE_OTHER);
	}
}
