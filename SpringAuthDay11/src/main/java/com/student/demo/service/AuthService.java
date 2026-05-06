package com.student.demo.service;

import org.springframework.stereotype.Service;

import com.student.demo.dto.UserRequest;
import com.student.demo.entity.Role;
import com.student.demo.entity.User;
import com.student.demo.repository.UserRepository;

@Service
public class AuthService {

	UserRepository userRepo;

	public AuthService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public String authUser(UserRequest userReq) {
		User user = userRepo.findByName(userReq.getName()).orElse(null);
		if (user.getPassword().equals(userReq.getPassword())) {
			if (user.getRole() == Role.ADMIN) {
				return "Welcome Admin";
			} else {
				return "Welcome User";
			}
		} else {
			return "Invalid Credentials.....";

		}

	}

}
