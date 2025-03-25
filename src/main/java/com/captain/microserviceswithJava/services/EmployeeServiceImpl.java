package com.captain.microserviceswithJava.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.captain.microserviceswithJava.error.EmployeeNotFoundException;
import com.captain.microserviceswithJava.models.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	List<Employee> employees = new ArrayList<>();

	@Override
	public Employee saveEmployee(Employee employee) {
		if(employee.getEmployeeID() == null || employee.getEmailID().isEmpty()) {
			employee.setEmployeeID(UUID.randomUUID().toString());
		}
		employees.add(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employees
				.stream()
				.filter(employee -> employee.getEmployeeID()
						.equalsIgnoreCase(id))
				.findFirst()
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: "+id));
	}

	@Override
	public String deleteEmployeeByID(String id) {
		Employee emp = employees.stream().filter(e -> e.getEmployeeID().equalsIgnoreCase(id)).findFirst().get();
		employees.remove(emp);
		return "Employee removed with id: "+ id;
	}

}
