package com.captain.microserviceswithJava.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private long id;
	private String name;
	private String emailId;
	
	
}
