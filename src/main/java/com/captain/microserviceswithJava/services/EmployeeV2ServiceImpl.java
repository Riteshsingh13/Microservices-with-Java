package com.captain.microserviceswithJava.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.captain.microserviceswithJava.entity.EmployeeEntity;
import com.captain.microserviceswithJava.models.Employee;
import com.captain.microserviceswithJava.repository.EmployeeRepository;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		if(employee.getEmployeeID() == null || employee.getEmailID().isEmpty()) {
			employee.setEmployeeID(UUID.randomUUID().toString());
		}
		EmployeeEntity entity = new EmployeeEntity();
		BeanUtils.copyProperties(employee, entity);
		employeeRepository.save(entity);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteEmployeeByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
