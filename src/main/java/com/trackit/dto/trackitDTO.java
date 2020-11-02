package com.trackit.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //maps class to database table
@Table(name="Foods")
public class trackitDTO {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Food_id")
	private int id;
	
	@Column(name="food_Name")
	private String foodName;
	
	@Column(name="Calories")
	private int calories;
	
	@Column(name="serving_Size")
	private int servingSize;
	
	//Set Constructors
	
	
	public trackitDTO() {
		
	}
	
	
	
	public trackitDTO(String foodName, int calories, int servingSize) {
		super();
		this.foodName = foodName;
		this.calories = calories;
		this.servingSize = servingSize;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getServingSize() {
		return servingSize;
	}
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}
	
	@Override
	public String toString() {
		return "trackitDTO [foodName=" + foodName + ", calories=" + calories + ", servingSize=" + servingSize + "]";
	}

	
	
	
}
