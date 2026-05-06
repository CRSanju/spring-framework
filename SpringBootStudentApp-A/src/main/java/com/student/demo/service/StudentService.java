package com.student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.demo.entity.Student;
import com.student.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepo;
	
	public Student getStudent(int roll, String name, int age, String email) {
		Student st = new Student(roll, name, age, email);
		return studentRepo.save(st);
	}

}
