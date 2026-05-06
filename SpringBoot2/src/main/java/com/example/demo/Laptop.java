package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	// FILED INJECTIONSS
	@Autowired
	OS os;

	// CONSTRUCTER INJECTION
//	Laptop(OS os) {
//		this.os = os;
//	}

	// SETTER INJECTION
//	@Autowired
//	void set(OS os) {
//		this.os = os;
//	}

	void build() {
		System.out.println("Laptop is ON......");
		os.operating();
	}
}
