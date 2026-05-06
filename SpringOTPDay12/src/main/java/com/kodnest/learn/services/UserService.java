package com.kodnest.learn.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.learn.entities.User;
import com.kodnest.learn.reposetories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public void register(User user) {
		userRepo.save(user);
	}

}
