package com.captain.microserviceswithJava.error;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}

}
