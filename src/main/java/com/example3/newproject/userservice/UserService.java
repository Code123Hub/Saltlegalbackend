package com.example3.newproject.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example3.newproject.repository.UserRepository;
import com.example3.newproject.userentity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	public void save(User user) {
		userRepository.save(user);
	}
	/*
	public String loadUserByUsername(String username,String password) {
		userRepository.findByUsername(null)
	}*/
	
}
