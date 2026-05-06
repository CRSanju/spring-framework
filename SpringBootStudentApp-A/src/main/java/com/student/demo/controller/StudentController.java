package com.student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.demo.entity.Student;
import com.student.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
   StudentService studService;
	
	@GetMapping("/")
	public String welcome() {
		return "index";
	}
	
	@PostMapping("/student")
	@ResponseBody
	public Student createStudent(
			@RequestParam int roll,
			@RequestParam String name,
			@RequestParam int age,
			@RequestParam String email) {
		Student st = studService.getStudent(roll, name, age, email);
		return st;
		
	}
   
}
