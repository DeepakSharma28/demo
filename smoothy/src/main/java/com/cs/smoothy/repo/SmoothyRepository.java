package com.cs.smoothy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cs.smoothy.model.Smoothy;


public interface SmoothyRepository extends JpaRepository<Smoothy,Long> {
	
//	@Modifying
//	@Query("update Smoothy s set s.basicDetails = :basicDetails where s.id = :id")
//	void updateSmoothyBasicDetailById(long id, String basicDetails);
//	
//	@Modifying
//	@Query("update Smoothy s set s.nutritionValues = :nutritionValues where s.id = :id")
//	void updateSmoothyNutritionValuesById(long id, String nutritionValues);
}
