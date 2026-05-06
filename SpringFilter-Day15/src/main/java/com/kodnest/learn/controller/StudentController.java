package com.kodnest.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@GetMapping("/attendence")
	public String attendence() {
		System.out.println("2. Entering student controller (Attendence)");
		return "Attendence has been Marked";
	}

	@GetMapping("/placement")
	public String placements() {
		System.out.println("2. Entering student controller (Placements)");
		return "Check for placements";
	}
}
