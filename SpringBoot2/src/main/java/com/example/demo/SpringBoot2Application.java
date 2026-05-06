package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot2Application {

	public static void main(String[] args) {
		ApplicationContext ref =  SpringApplication.run(SpringBoot2Application.class, args);
		
		Laptop l = ref.getBean(Laptop.class);
		l.build();
	}

}
