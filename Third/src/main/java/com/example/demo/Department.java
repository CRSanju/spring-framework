package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {

	int depId;
	String depName;
	
	

	public Department(@Value("${department.depId}") int depId,
			@Value("${department.depName}") String depName) {
		super();
		this.depId = depId;
		this.depName = depName;
	}
	
	void depDetails() {
		System.out.println("Dep ID: " + depId);
		System.out.println("Dep Name: " + depName);
	}
	
}
