package com.kodnest.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hello")
	public String greeting() {
		System.out.println("2. Filtering");
		return "Hello, How are you?!";
	}

}
