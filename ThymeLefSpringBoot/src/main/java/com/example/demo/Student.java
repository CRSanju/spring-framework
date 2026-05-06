package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Student")
public class Student {
	
	@GetMapping("/show")
	//
	public String showDetails(Model m) {
		m.addAttribute("message", "I love India");
		return "detail";
	}

}
