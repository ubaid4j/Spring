package com.ubaid.app.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController
{
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> handleException(CustomerNotFoundException exp)
	{
		int status = HttpStatus.NOT_FOUND.value();
		HttpStatus status_ = HttpStatus.NOT_FOUND;
		long timeStamp = System.currentTimeMillis();
		String message = exp.getMessage();
		
		ExceptionResponse body = new ExceptionResponse(status, message, timeStamp);
		
		return new ResponseEntity<ExceptionResponse>(body, status_);
	}

	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> handleException(Exception exp)
	{
		int status_b = HttpStatus.BAD_REQUEST.value();
		String message = exp.getMessage();
		long timeStamp = System.currentTimeMillis();
		ExceptionResponse body = new ExceptionResponse(status_b, message, timeStamp);
		ResponseEntity<ExceptionResponse> responseEntity = new ResponseEntity<ExceptionResponse>(body, HttpStatus.BAD_REQUEST);
		return responseEntity;
	}
}
