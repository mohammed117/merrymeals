package com.dea.mealsonwheels.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dea.mealsonwheels.entity.Donor;
import com.dea.mealsonwheels.repository.DonorRepository;


@Service
@Transactional
public class DonorserviceImpl implements Donorservice {

    @Autowired
	DonorRepository donrepo;
    
	@Override
	public void registerDonor(Donor don) {
		// TODO Auto-generated method stub
		donrepo.save(don);
	}

	@Override
	public List<Donor> manageDonor() {
		// TODO Auto-generated method stub
		return donrepo.findAll();
	}


}
