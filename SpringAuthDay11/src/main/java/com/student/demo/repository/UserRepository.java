package com.student.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	// FindByName
	Optional<User> findByName(String name);
}
