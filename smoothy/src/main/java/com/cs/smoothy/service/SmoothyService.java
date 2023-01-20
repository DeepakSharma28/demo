package com.cs.smoothy.service;

import java.util.List;

import com.cs.smoothy.model.Smoothy;

public interface SmoothyService {
	List<Smoothy> getAllSmoothies();
	void save(Smoothy smoothy);
//	Smoothy getById(Long id);
	void deleteSmoothy(long id);
	void updateSmoothyBasicDetailsbyId(long id,String bacicDetails);
	void updateSmoothyNutritionValuesbyId(long id,String nutritionValues);

}
