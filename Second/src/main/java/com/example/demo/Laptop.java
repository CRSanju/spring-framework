package com.example.demo;

import org.springframework.stereotype.Component;

@Component("Lap")
public class Laptop implements ElectronicDevice {

//	void work() {
//		System.out.println("Laptop is working....");
//	}

	public void useDevice() {
		System.out.println("Laptop is getting used");
	}

}
