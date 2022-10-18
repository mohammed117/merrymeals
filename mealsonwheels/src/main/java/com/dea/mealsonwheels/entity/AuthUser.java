package com.dea.mealsonwheels.entity;

public class AuthUser {
	
	private String email;
	private String password;
	
	public AuthUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AuthUser [email=" + email + ", password=" + password + "]";
	}

	
	
	
}
