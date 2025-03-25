package com.captain.microserviceswithJava.models;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {

	private HttpStatus status;
	private String message;
}
