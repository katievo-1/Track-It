package com.trackit.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Foods {


	@SerializedName("Food_Code") 
	@Expose 
	private String foodCode; 
	@SerializedName("Display_Name") 
	@Expose 
	private String displayName; 
	@SerializedName("Portion_Default") 
	@Expose 
	private String portionDefault; 
	@SerializedName("Calories") 
	@Expose 
	private String calories; 

	//Set Constructors

	public Foods() {
		
	}

	public Foods(String foodCode, String displayName, String portionDefault, String calories) {
		super();
		this.foodCode = foodCode;
		this.displayName = displayName;
		this.portionDefault = portionDefault;
		this.calories = calories;
	}
	
	public String getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPortionDefault() {
		return portionDefault;
	}

	public void setPortionDefault(String portionDefault) {
		this.portionDefault = portionDefault;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return foodCode + "" + displayName + "" + calories + "" + portionDefault;
	}
	
	
	
	

	
	
	
}
