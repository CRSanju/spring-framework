package com.example.demo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Lin")
//@Primary
public class Linux implements OS {
	
	public void operating() {
		System.out.println("Linux is operating..");
	}

}
