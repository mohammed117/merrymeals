package com.dea.mealsonwheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dea.mealsonwheels.entity.AuthUser;
import com.dea.mealsonwheels.entity.User;
import com.dea.mealsonwheels.jwtconfig.JwtUtil;
import com.dea.mealsonwheels.service.Userservice;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class UserController {
	@Autowired
	JwtUtil jwit;
	@Autowired
	AuthenticationManager authenticationmanager;
	@Autowired
	Userservice uservice;
	

		@PostMapping(value = "/register")
		public String addMember(@RequestBody User us) {
			uservice.registerUser(us);
			return "Data Added";
		}


		@PostMapping(value = "/authenticate")
		public String getToken(@RequestBody AuthUser auth) throws Exception {
			try {
				authenticationmanager
				.authenticate(new UsernamePasswordAuthenticationToken(auth.getEmail(), auth.getPassword()));
			} catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Invalid User name password");
			}

			return jwit.generateToken(auth.getEmail());

		}
		
		@GetMapping(value = "/searchuser")
		public List<User> searchByro(@RequestParam("role") String role){
			System.out.println(role);
			return uservice.searchByRole(role);
		}
		
		@GetMapping(value = "/searchpartner")
		public List<User> searchByPom(@RequestParam("ppartm") String ppartm){
			System.out.println(ppartm);
			return uservice.searchByPartofmumbai(ppartm);
		}
		
		@GetMapping(value = "/searchmember")
		public List<User> searchByMpom(@RequestParam("partm") String partm){
			System.out.println(partm);
			return uservice.searchByMPartofmumbai(partm);
		}

		@GetMapping(value = "/search/{data}")
		public List<User> searchByMail(@PathVariable("data") String email){
			System.out.println(email);
			return uservice.getEmail(email);
		}
		
		@GetMapping(value = "/deleteuser/{emaildelete}")
	    public String deleteUser(@PathVariable("emaildelete") String email) {
			System.out.println(email);
			uservice.deleteUser(email);
	    	return "Data Deleted";
	    	
	    	
	    }
	}
