package com.example3.newproject.userentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {

	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	 
	@Column(nullable=false)
	private String emailId;
	
	@Column(nullable=false,unique=true)
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	

	public User(String emailId, String username, String password) {
		super();
		this.emailId = emailId;
		this.username = username;
		this.password = password;
	}

	public User() {
		
	}
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	

	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", username=" + username + ", password=" + password + "]";
	}

	

	
	
}
