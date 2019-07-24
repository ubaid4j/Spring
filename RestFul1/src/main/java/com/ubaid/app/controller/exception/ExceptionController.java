package com.ubaid.app.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ubaid.app.entity.StudentException;
import com.ubaid.app.exception.StudentNotFoundException;

@ControllerAdvice
public class ExceptionController
{
	@ExceptionHandler
	public ResponseEntity<StudentException> handleException(StudentNotFoundException exp)
	{
		String message = exp.getMessage();
		long timeStamp = System.currentTimeMillis();
		StudentException status = new StudentException(HttpStatus.NOT_FOUND.value(), message, timeStamp);
		return new ResponseEntity<StudentException>(status, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentException> handleException(Exception exp)
	{
		String message = exp.getMessage();
		long timeStamp = System.currentTimeMillis();
		int httpStatus = HttpStatus.BAD_REQUEST.value();
		HttpStatus header = HttpStatus.BAD_REQUEST;
		StudentException body = new StudentException(httpStatus, message, timeStamp);
		return new ResponseEntity<StudentException>(body, header);
	}

}
