package com.kodnest.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/res1")
	public String getResponse1() {
		System.out.println("Request reached without filter alteration.");
		return "Hello1";
	}

	@GetMapping("/res2")
	public String getResponse2(HttpServletRequest req) {
		String res = (String) req.getAttribute("checked");
		if ("TRUE".equals(res)) {
			return "Hello2";
		} else {
			return "HACKER .... BE CAREFUL";

		}
	}

	@GetMapping("/res3")
	public String getResponse3(HttpServletRequest req) {
		String res = (String) req.getAttribute("checked");
		if ("TRUE".equals(res)) {
			return "Hello3";
		} else {
			return "HACKER .... BE CAREFUL";
		}
	}
}
