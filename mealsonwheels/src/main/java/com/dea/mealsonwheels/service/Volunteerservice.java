package com.dea.mealsonwheels.service;

import java.util.List;
import com.dea.mealsonwheels.entity.Volunteer;

public interface Volunteerservice {
	
	public void registerVolunteer(Volunteer vol);
	public List<Volunteer> manageVolunteer();

	public void deleteVol(String vemail);

}
