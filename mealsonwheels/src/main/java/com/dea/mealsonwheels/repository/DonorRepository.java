package com.dea.mealsonwheels.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dea.mealsonwheels.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, String> {

}

