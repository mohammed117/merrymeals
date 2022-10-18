package com.dea.mealsonwheels.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dea.mealsonwheels.entity.User;
import com.dea.mealsonwheels.repository.UserRepository;


@Service
@Transactional
public class UserserviceImpl implements Userservice{
    @Autowired
 	UserRepository userrepo;

	@Override
	public void registerUser(User us) {
		// TODO Auto-generated method stub
		userrepo.save(us);
		
	}

	@Override
	public List<User> searchByRole(String role) {
		// TODO Auto-generated method stub
		return userrepo.searchByRole(role);
	}
	
	@Override
	public List<User> searchByPartofmumbai(String ppartm) {
		// TODO Auto-generated method stub
		return userrepo.searchByPartofmumbai(ppartm);
	}

	@Override
	public List<User> searchByMPartofmumbai(String partm) {
		// TODO Auto-generated method stub
		return userrepo.searchByMPartofmumbai(partm);
	}

	@Override
	public List<User> getEmail(String email) {
		// TODO Auto-generated method stub
		return userrepo.seachByEmail(email);
	}

	@Override
	public void deleteUser(String email) {
		// TODO Auto-generated method stub
		userrepo.deleteById(email);
	}

	
 	



}
