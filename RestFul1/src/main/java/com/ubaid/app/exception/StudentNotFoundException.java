package com.ubaid.app.exception;

public class StudentNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = -9211777878498549188L;

	public StudentNotFoundException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public StudentNotFoundException(String message)
	{
		super(message);
	}

	public StudentNotFoundException(Throwable cause)
	{
		super(cause);
	}

	
}
