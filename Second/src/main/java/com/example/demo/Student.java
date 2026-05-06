package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

//	@Autowired
//	Laptop ref;
//	// @Autowired
//	public Student(Laptop ref) {
//		super();
//		this.ref = ref;
//	}
//	@Autowired
//	void setRef(Laptop ref) {
//		this.ref = ref;
////	}
//	void study() {
//		System.out.println("Student is studying.....");
//	}
//	void useLaptop() {
//		ref.work();
//	}

	ElectronicDevice ref;

	void study() {
		System.out.println("Student studying");
	}

	void workingWithDevice() {
		ref.useDevice();
	}

	// @Autowired
	public Student(@Qualifier("Mob") ElectronicDevice ref) {
		this.ref = ref;
	}

}
