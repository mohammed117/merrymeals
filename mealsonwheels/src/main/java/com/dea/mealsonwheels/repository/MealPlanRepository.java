package com.dea.mealsonwheels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dea.mealsonwheels.entity.MealPlan;

public interface MealPlanRepository extends JpaRepository<MealPlan, Integer>  {

}
