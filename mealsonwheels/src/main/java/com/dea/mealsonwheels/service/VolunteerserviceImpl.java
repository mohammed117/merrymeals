package com.dea.mealsonwheels.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dea.mealsonwheels.entity.Volunteer;
import com.dea.mealsonwheels.repository.VolunteerRepository;

@Service
@Transactional
public class VolunteerserviceImpl implements Volunteerservice {

    @Autowired
	VolunteerRepository volrepo;
    
	@Override
	public void registerVolunteer(Volunteer vol) {
		// TODO Auto-generated method stub
		volrepo.save(vol);
	}

	@Override
	public List<Volunteer> manageVolunteer() {
		// TODO Auto-generated method stub
		return volrepo.findAll();
	}

	@Override
	public void deleteVol(String vemail) {
		// TODO Auto-generated method stub
		volrepo.deleteById(vemail);
	}


}
