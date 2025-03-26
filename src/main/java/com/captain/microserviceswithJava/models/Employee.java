package com.captain.microserviceswithJava.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties("department")
public class Employee {

	private String employeeID;
	private String firstName;
	private String lastName;
	private String emailID;
	
//	@JsonIgnore
//	Used for data filtering - when we don't want to send particular data into the response.
	private String department;
}
