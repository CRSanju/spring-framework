package com.kodnest.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Trainer")
public class TrainerController {
	
	@GetMapping("/class")
	public String startClass() {
		System.out.println("2. Entering Trainer controller (Class)");
		return "Trainer has started the class";
	}
	
	@GetMapping("/assessment")
	public String addAssessment() {
		System.out.println("2. Entering Trainer controller (Assessment)");
		return "Add the assessments for students";
	}

}
