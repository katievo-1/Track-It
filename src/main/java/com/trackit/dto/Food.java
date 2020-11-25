package com.trackit.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="foods")
public class Food {
	
	//Set the fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
	@Column(name="Food_Name")
	private String foodName;
	
	@Column(name="Calorie")
	private String calorie;
	
	//Set the Constructors
	
	public Food() {
	}
	

	public Food(int id, String foodName, String calorie) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.calorie = calorie;
	}

	//Set the Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getFoodName() {
		return foodName;
	}


	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}


	public String getCalorie() {
		return calorie;
	}


	public void setCalorie(String calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", foodName=" + foodName + ", calorie=" + calorie + "]";
	}
}
