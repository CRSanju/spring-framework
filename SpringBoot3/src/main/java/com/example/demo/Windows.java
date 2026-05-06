package com.example.demo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Win")
//@Primary
public class Windows implements OS {
	
	public void operating() {
		System.out.println("Windows is operating.....");
	}

}
