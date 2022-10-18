package com.dea.mealsonwheels.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dea.mealsonwheels.entity.MealPlan;
import com.dea.mealsonwheels.repository.MealPlanRepository;



@Service
@Transactional
public class MealPlanserviceImpl implements MealPlanservice  {

	 @Autowired
		MealPlanRepository mealplanrepo;
	    
		@Override
		public void addMealPlan(MealPlan mealplan) {
			// TODO Auto-generated method stub
			mealplanrepo.save(mealplan);
		}

		@Override
		public List<MealPlan> showMealPlan() {
			// TODO Auto-generated method stub
			return mealplanrepo.findAll();
		}
		
		

}
