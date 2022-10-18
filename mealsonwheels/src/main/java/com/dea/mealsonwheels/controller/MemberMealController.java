package com.dea.mealsonwheels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dea.mealsonwheels.entity.MealPlan;
import com.dea.mealsonwheels.entity.MemberMeal;
import com.dea.mealsonwheels.service.MemberMealservice;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" )
public class MemberMealController {

	@Autowired
	MemberMealservice membermealservice;

	@PostMapping(value = "/addmembermeal")
	public String addMemberMeal(@RequestBody MemberMeal membermeal) {
		membermealservice.addMemberMeal(membermeal);
		System.out.println(membermeal);
		return "Data Added";
	}

	@GetMapping(value = "/showmembermeal")
	public List<MemberMeal> getData() {
		List<MemberMeal> data=membermealservice.showMemberMeal();
		//System.out.println(data);
		return data;
	}
}
