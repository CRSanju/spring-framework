package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	OS os;
	
	Laptop(@Qualifier("Win")  OS os) {
		this.os = os;
	}
	
	void build() {
		System.out.println("Laptop is on");
		os.operating();
	}

}
