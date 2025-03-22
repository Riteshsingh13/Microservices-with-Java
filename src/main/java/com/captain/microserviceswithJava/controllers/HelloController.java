package com.captain.microserviceswithJava.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.captain.microserviceswithJava.models.User;

//@Controller
//@ResponseBody     //used/required to pass data to the server (String)
@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}


	@RequestMapping("/user")   //Default method is GET if not specified 
	// Simply returning the object to the server
	public User userDetails() {
		User user = new User();
		user.setId(01);
		user.setName("Captain");
		user.setEmailId("dtxcaptain@gmail.com");
		return user;
	}
	
	
	// path variable used where data is mandatory
	@GetMapping("/{id}/{id2}")                          // ("This is used to define different variable name")
	public String pathVariable(@PathVariable String id, @PathVariable("id2") String name) {
		return "Path valiable is: "+ id + " "+ name;
	}
	
	// path variable used where data is not mandatory, use attribute required = false and & sign to pass 2 or more parameters
	@GetMapping("/requestParam")
	public String requestParam(@RequestParam String name, @RequestParam(name="email", required = false, defaultValue = "") String emailID) {
		return "Reqest parameter is: "+ name + " Email id is: "+ emailID;
	}
}