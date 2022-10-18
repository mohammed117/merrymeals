package com.dea.mealsonwheels.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dea.mealsonwheels.entity.User;


public interface UserRepository extends JpaRepository<User, String> {

	public User findByEmail(String email);

	 @Query("SELECT u FROM User u WHERE role=:role")
	public List<User> searchByRole(String role);
	 
	 @Query("SELECT u FROM User u WHERE ppartm=:ppartm")
	    public List<User> searchByPartofmumbai(String ppartm);
	 
	 @Query("SELECT u FROM User u WHERE partm=:partm")
	    public List<User> searchByMPartofmumbai(String partm);
	 
	 @Query("SELECT u FROM User u WHERE email=:email")
	    public List<User> seachByEmail(String email);
	 
}
