package com.dea.mealsonwheels.service;

import java.util.List;


import com.dea.mealsonwheels.entity.User;



public interface Userservice {
	public void registerUser(User us);

	public List<User> searchByRole(String role);
	public List<User> searchByPartofmumbai(String ppartm);
	public List<User> searchByMPartofmumbai(String partm);
	public List<User> getEmail(String email);
	public void deleteUser(String email);

	
}
