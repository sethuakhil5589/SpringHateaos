package com.akhil.entity;

import org.springframework.hateoas.RepresentationModel;

public class Courses extends RepresentationModel<Courses>{
	public Courses() {
		super();
	}
	private Integer id;
	private String cName;
	private String instructor;
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Courses(Integer id, String cName, String instructor, Double price) {
		super();
		this.id = id;
		this.cName = cName;
		this.instructor = instructor;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", cName=" + cName + ", instructor=" + instructor + ", price=" + price + "]";
	}
	
}
