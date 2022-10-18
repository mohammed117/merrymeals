package com.dea.mealsonwheels.service;

import java.util.List;

import com.dea.mealsonwheels.entity.MealPlan;


public interface MealPlanservice {
	
	public void addMealPlan(MealPlan mealplan);
	public List<MealPlan> showMealPlan();

}
