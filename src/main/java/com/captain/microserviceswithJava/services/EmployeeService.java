package com.captain.microserviceswithJava.services;

import java.util.List;

import com.captain.microserviceswithJava.models.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(String id);

	String deleteEmployeeByID(String id);

}
