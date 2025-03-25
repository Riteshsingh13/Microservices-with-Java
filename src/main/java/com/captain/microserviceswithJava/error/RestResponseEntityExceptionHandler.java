package com.captain.microserviceswithJava.error;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.captain.microserviceswithJava.models.ErrorMessage;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	// used to define this is exception handler for which exception
	@ExceptionHandler(EmployeeNotFoundException.class)
	
	// this method will return the response body in return.
	@ResponseBody
	
	//used for specify the status code otherwise it will return 200.
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	// "EmployeeNotFoundException exception" this is used to tell which particular exception need to be handled.
	public ErrorMessage employeeNotFoundHandler(EmployeeNotFoundException exception) {
		ErrorMessage errorMassage = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
		return errorMassage;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorMessage genericExceptionHandler(Exception ex) {
		ErrorMessage errorMessage = new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
		return errorMessage;
	}
}
