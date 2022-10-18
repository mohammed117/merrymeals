package com.dea.mealsonwheels.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.dea.mealsonwheels.entity.User;
import com.dea.mealsonwheels.repository.UserRepository;


@Service
public class CustomerUserService implements UserDetailsService {
    @Autowired
	UserRepository mrepo;
   
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
       User us=mrepo.findByEmail(email);
      org.springframework.security.core.userdetails.User users=new org.springframework.security.core.userdetails.User(us.getEmail(), us.getPassword(), new ArrayList<>());
      return users;
	}
	
}
