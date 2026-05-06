package com.example.demo;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/Greeting")
public class Request {

	@GetMapping("/Greet")
	//@ResponseBody
	public String greet() {
		return "Hi Anubhav are you ok";
	}

	@GetMapping("/Hi")
	//@ResponseBody
	public String hi() {
		return "Hi, How are You?";
	}

	@GetMapping("/Bye")
	//@ResponseBody
	public String bye() {
		return "Good bye take care";
	}

	@GetMapping("/Gn")
	//@ResponseBody
	public String goodNight() {
		return "Hi, Good night sweet dreams";
	}

	@GetMapping("/Num")
	//@ResponseBody
	public int num() {
		return 1001;
	}

	@RequestMapping("/all")
	//@ResponseBody
	public String all() {
		return "<marquee>" + greet() + "<br>" + hi() + "<br>" + bye() + "<br>" + goodNight() + "<br>" + num();
	}
}
