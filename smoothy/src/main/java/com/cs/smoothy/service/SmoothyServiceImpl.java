package com.cs.smoothy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.smoothy.model.Smoothy;
import com.cs.smoothy.repo.SmoothyRepository;

@Service
public class SmoothyServiceImpl implements SmoothyService {

	@Autowired
	private SmoothyRepository smoothyRepo;

	@Override
	public List<Smoothy> getAllSmoothies() {
		return smoothyRepo.findAll();
	}

	@Override
	public void save(Smoothy smoothy) {
		smoothyRepo.save(smoothy);
	}
//
//	@Override
//	public Smoothy getById(Long id) {
//		Optional<Smoothy> optional = smoothyRepo.findById(id);
//		Smoothy employee = null;
//		if (optional.isPresent())
//			employee = optional.get();
//		else
//			throw new RuntimeException("Employee not found for id : " + id);
//		return employee;
//	}
//
	@Override
	public void deleteSmoothy(long id) {
		smoothyRepo.deleteById(id);
	}

	@Override
	public void updateSmoothyBasicDetailsbyId(long id, String bacicDetails) {
		Optional<Smoothy> smoothy = smoothyRepo.findById(id);
		Smoothy smoothyObj = smoothy.get();
		smoothyObj.setBasicDetails(bacicDetails);
		smoothyRepo.save(smoothyObj);
		
	}

	@Override
	public void updateSmoothyNutritionValuesbyId(long id, String nutritionValues) {
		Optional<Smoothy> smoothy = smoothyRepo.findById(id);
		Smoothy smoothyObj = smoothy.get();
		smoothyObj.setNutritionValues(nutritionValues);
		smoothyRepo.save(smoothyObj);
		
	}

}
