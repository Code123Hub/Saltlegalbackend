package com.example3.newproject.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example3.newproject.userentity.User;
import com.example3.newproject.userservice.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody User user){
	    if(userService.findByUsername(user.getUsername())!=null) {
	    	return ResponseEntity.badRequest().body("Username already exist");
	    }
	    userService.save(user);
	    return ResponseEntity.ok("User registered successfully");
	}
	
	/*
	@PostMapping("/login")
	public ResponseEntity<?>loginUser(@RequestBody User user){
	 	return "kjhnb"; 
	}*/
	
	
}
