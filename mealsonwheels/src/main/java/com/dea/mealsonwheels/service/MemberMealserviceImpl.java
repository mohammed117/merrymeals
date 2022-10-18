package com.dea.mealsonwheels.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dea.mealsonwheels.entity.MemberMeal;
import com.dea.mealsonwheels.repository.MemberMealRepository;

@Service
@Transactional
public class MemberMealserviceImpl implements MemberMealservice {
	  @Autowired
		MemberMealRepository memmealrepo;
	    
		@Override
		public void addMemberMeal(MemberMeal membermeal) {
			// TODO Auto-generated method stub
			memmealrepo.save(membermeal);
		}

		@Override
		public List<MemberMeal> showMemberMeal() {
			// TODO Auto-generated method stub
			return memmealrepo.findAll();
		}

}
