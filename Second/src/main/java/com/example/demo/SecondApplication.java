package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext ref = SpringApplication.run(SecondApplication.class, args);
		Student s = ref.getBean(Student.class);
//		s.study();
//		s.useLaptop();

		s.study();
		s.workingWithDevice();
	}

}
