package com.ersoy.security.dto;

import java.util.HashSet;
import java.util.Set;

import com.ersoy.security.model.RoleEntity;

public class SignupRequest {
	
    String username; 
	
	String password;
	
	String email;
	
	private Set<String> roles = new HashSet<>();
	
	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	
	

}
