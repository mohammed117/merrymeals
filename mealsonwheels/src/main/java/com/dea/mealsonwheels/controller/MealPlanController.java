package com.dea.mealsonwheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dea.mealsonwheels.entity.MealPlan;
import com.dea.mealsonwheels.service.MealPlanservice;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class MealPlanController {

	@Autowired
	MealPlanservice mealplanservice;

	@PostMapping(value = "/addmealplan")
	public String addMealPlan(@RequestBody MealPlan mealplan) {
		mealplanservice.addMealPlan(mealplan);

		return "Data Added";
	}

	@GetMapping(value = "/showmealplan")
	public List<MealPlan> getData() {
		List<MealPlan> data=mealplanservice.showMealPlan();
		//System.out.println(data);
		return data;
	}
}
