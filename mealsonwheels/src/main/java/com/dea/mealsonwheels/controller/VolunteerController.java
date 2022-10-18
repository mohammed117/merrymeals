package com.dea.mealsonwheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dea.mealsonwheels.entity.MealPlan;
import com.dea.mealsonwheels.entity.User;
import com.dea.mealsonwheels.entity.Volunteer;

import com.dea.mealsonwheels.service.Volunteerservice;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class VolunteerController {
	
	 @Autowired
		Volunteerservice vservice;
	
	@PostMapping(value = "/vregister")
    public String addVolunteer(@RequestBody Volunteer vol) {
    	vservice.registerVolunteer(vol);
    	
    	return "Data Added";
    }
	
	@GetMapping(value = "/managevolunteer")
	public List<Volunteer> getData() {
		List<Volunteer> data=vservice.manageVolunteer();
		//System.out.println(data);
		return data;
	}
	
	@GetMapping(value = "/deletevol/{vemaildelete}")
    public String deleteVolunteer(@PathVariable("vemaildelete") String vemail) {
		System.out.println(vemail);
		vservice.deleteVol(vemail);
    	return "Data Deleted";
    	
    	
    }
	
	

}