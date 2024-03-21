package com.example3.newproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example3.newproject.userentity.User;

public interface UserRepository extends JpaRepository<User,Long> {

	User findByUsername(String username);
	
	
}
