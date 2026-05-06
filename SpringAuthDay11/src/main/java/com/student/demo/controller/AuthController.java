package com.student.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.dto.UserRequest;
import com.student.demo.service.AuthService;

@RestController
public class AuthController {

	AuthService authService;

	public AuthController(AuthService authService) {
		super();
		this.authService = authService;
	}

	@PostMapping("/login")
	public String login(@RequestBody UserRequest userReq) {
		return authService.authUser(userReq);
	}
}
