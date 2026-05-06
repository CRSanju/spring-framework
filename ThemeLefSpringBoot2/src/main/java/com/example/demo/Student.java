package com.example.demo;

//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//@Controller
//@RequestMapping("/Student")
//public class Student {
//
//	@GetMapping("/Show/{name}")
//	public String showDetials(@PathVariable String name, Model m) {
//		m.addAttribute("message", name);
//		return "details";
//	}
//
//}


//@RestController
//@RequestMapping("/student")
//public class Student {
//
//	@GetMapping("/show/{name}/{age}/{gender}")
//	public String showDetials(@PathVariable String name, @PathVariable int  age, @PathVariable String gender) {
//		return name + " " +  age + " "  + gender;
//	}


@RestController
@RequestMapping("/student")
public class Student {

	@GetMapping("/show")
	public String showDetials(@RequestParam String name, @RequestParam int  age, @RequestParam String gender) {
		return name + " " +  age + " "  + gender;
	}

}
