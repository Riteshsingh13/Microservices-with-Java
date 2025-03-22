package com.captain.microserviceswithJava.models;

import lombok.Data;

@Data
public class Employee {

	private String employeeID;
	private String firstName;
	private String lastName;
	private String emailID;
	private String department;
}
