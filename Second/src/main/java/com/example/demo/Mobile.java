package com.example.demo;

//
import org.springframework.stereotype.Component;

@Component("Mob")
//@Primary
public class Mobile implements ElectronicDevice {

	public void useDevice() {
		System.out.println("Mobile is getting used");
	}

}
