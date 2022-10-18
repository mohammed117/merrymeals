package com.dea.mealsonwheels.service;

import java.util.List;

import com.dea.mealsonwheels.entity.Donor;


public interface Donorservice {
	
	public void registerDonor(Donor don);
	public List<Donor> manageDonor();

}
