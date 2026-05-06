package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {

	int roll = 12;
	String name = "Raju";

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
