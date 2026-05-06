package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	int empId;
	String empName;
	double empSalary;
	
	Department dep;
	
	void work() {
		System.out.println("Employee is working.....");
	}
	
	void details() {
		System.out.println("Emp ID: " + empId);
		System.out.println("Emp Name: " + empName);
		System.out.println("Emp Salary: " + empSalary);
		dep.depDetails();
	}

	
	public Employee(@Value("${employee.id}")int empId,
			@Value("${employee.name}") String empName,
			@Value("${employee.empSalary}") double empSalary, 
			Department dep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dep = dep;
	}
	
	
}
