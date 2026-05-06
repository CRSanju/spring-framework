package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext ref = SpringApplication.run(FirstApplication.class, args);

		Student s = ref.getBean(Student.class);
		System.out.println(s.roll);
		System.out.println(s.name);
	}

}
