package com.cs.smoothy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Smoothy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;

	private String description;
	
	private String basicDetails;
	private String nutritionValues;
//	private String details_id;
	
//	@OneToOne(mappedBy = "smoothy", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
//	private Details details;

	
//	public String getDetails_id() {
//		return details_id;
//	}
//
//	public void setDetails_id(String details_id) {
//		this.details_id = details_id;
//	}



	public void setId(long id) {
		this.id = id;
	}


	

	
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(String basicDetails) {
		this.basicDetails = basicDetails;
	}

	public String getNutritionValues() {
		return nutritionValues;
	}

	public void setNutritionValues(String nutritionValues) {
		this.nutritionValues = nutritionValues;
	}



}
