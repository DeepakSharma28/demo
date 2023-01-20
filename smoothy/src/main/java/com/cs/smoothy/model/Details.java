//package com.cs.smoothy.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapsId;
//import javax.persistence.OneToOne;
//
//import org.springframework.data.annotation.Id;
//
//@Entity
//public class Details {
//	@Id
//  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "smoothyId")
//	private long id;
//	private String type;
//	private String ingridients;
//	
//	
//	@OneToOne
//    @MapsId
//    @JoinColumn(name = "smoothyId")
//	private Smoothy smoothy;
//	
//	public long getId() {
//		return id;
//	}
//
//	public String getType() {
//		return type;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getIngridients() {
//		return ingridients;
//	}
//	public void setIngridients(String ingridients) {
//		this.ingridients = ingridients;
//	}
//	public Smoothy getSmoothy() {
//		return smoothy;
//	}
//	public void setSmoothy(Smoothy smoothy) {
//		this.smoothy = smoothy;
//	}
//
//}
//
