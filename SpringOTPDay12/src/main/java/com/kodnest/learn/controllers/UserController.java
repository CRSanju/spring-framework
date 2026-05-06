package com.kodnest.learn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodnest.learn.entities.User;
import com.kodnest.learn.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userServ;

	@GetMapping("/")
	public String displaySignUpPage() {
		return "index";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {
		userServ.register(user);
		System.out.println("Registration Successfull");
		return "login";
	}
}
