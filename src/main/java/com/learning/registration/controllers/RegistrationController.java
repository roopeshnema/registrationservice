package com.learning.registration.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author test
 *
 */
@RestController
public class RegistrationController {
	
	@RequestMapping("/register")
	public String hello() {
		return "This is Registration Flow.";
	}
	
}
