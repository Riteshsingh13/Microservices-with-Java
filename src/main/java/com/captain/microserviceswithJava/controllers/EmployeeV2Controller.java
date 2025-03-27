package com.captain.microserviceswithJava.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.captain.microserviceswithJava.models.Employee;
import com.captain.microserviceswithJava.services.EmployeeService;

@RestController
@RequestMapping("/v2/employees")
public class EmployeeV2Controller {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employee;
	}
	
	
}
