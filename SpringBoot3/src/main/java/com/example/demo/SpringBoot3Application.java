package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {
		ApplicationContext ref = SpringApplication.run(SpringBoot3Application.class, args);
		
		 Laptop lap = ref.getBean(Laptop.class);
		 lap.build();
	}

}
