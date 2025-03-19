package com.captain.microserviceswithJava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.captain.microserviceswithJava.model.User;

//@Controller
//@ResponseBody
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping("/user")
	public User userDetails() {
		User user = new User();
		user.setId(01);
		user.setName("Captain");
		user.setEmailId("dtxcaptain@gmail.com");
		return user;
	}
}