package com.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthentication {

	@GetMapping("/secure")
	public String displayMessage() {
		return "I am from Spring Security......";
	}
}
