package com.trackit.dto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodList {
	@SerializedName("Food_Display_Row") 
	@Expose 
	private List<Foods> foodRow = null; 
	 
	public List<Foods> getFoods() { 
	return foodRow; 
	} 
	 
	public void setFoodDisplayRow(List<Foods> foodRow) { 
	this.foodRow = foodRow; 
	} 
	
}
