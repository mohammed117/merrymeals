package com.dea.mealsonwheels.service;


import java.util.List;

import com.dea.mealsonwheels.entity.MealPlan;
import com.dea.mealsonwheels.entity.MemberMeal;

public interface MemberMealservice {

	public void addMemberMeal(MemberMeal membermeal);
	public List<MemberMeal> showMemberMeal();
}
