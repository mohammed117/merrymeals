package com.dea.mealsonwheels.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.dea.mealsonwheels.entity.Volunteer;

public interface VolunteerRepository extends JpaRepository<Volunteer, String> {

}
