package com.dea.mealsonwheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dea.mealsonwheels.entity.Donor;

import com.dea.mealsonwheels.service.Donorservice;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class DonorController {
	
	 @Autowired
		Donorservice dservice;
	
	@PostMapping(value = "/dregister")
    public String addDonor(@RequestBody Donor don) {
    	dservice.registerDonor(don);
    	
    	return "Data Added";
    }
	
	@GetMapping(value = "/managedonor")
	public List<Donor> getData() {
		List<Donor> data=dservice.manageDonor();
		//System.out.println(data);
		return data;
	}

}
