package com.trackit;

public class trackitDTO {

	
	private String foodName;
	private int calories;
	private int servingSize;
	
	
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
	
	/*
	@Override
	public String toString() {
		return "trackitDTO [foodName=" + foodName + ", Calories=" + Calories + ", servingSize=" + servingSize + "]";
	}
	*/
	
	
	
}
