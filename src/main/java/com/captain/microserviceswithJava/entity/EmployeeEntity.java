package com.captain.microserviceswithJava.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "emp_table")
@Data
public class EmployeeEntity {
	
	@Id
	private String employeeID;
	private String firstName;
	private String lastName;
	private String emailID;
	private String department;

}
