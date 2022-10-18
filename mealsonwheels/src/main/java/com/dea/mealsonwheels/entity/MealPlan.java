package com.dea.mealsonwheels.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mealplan")
public class MealPlan {
	
	@Id
	
	private String day;
	private String meal1;
	private String meal2;
	private String meal3;
	
	public MealPlan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MealPlan(String day, String meal1, String meal2, String meal3) {
		super();
		this.day = day;
		this.meal1 = meal1;
		this.meal2 = meal2;
		this.meal3 = meal3;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMeal1() {
		return meal1;
	}

	public void setMeal1(String meal1) {
		this.meal1 = meal1;
	}

	public String getMeal2() {
		return meal2;
	}

	public void setMeal2(String meal2) {
		this.meal2 = meal2;
	}

	public String getMeal3() {
		return meal3;
	}

	public void setMeal3(String meal3) {
		this.meal3 = meal3;
	}

	@Override
	public String toString() {
		return "MealPlan [day=" + day + ", meal1=" + meal1 + ", meal2=" + meal2 + ", meal3=" + meal3 + "]";
	}

	
	

}
