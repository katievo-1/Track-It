package com.trackit.dto;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class FoodList {

	@SerializedName("Food_Display_Row")
	List<Foods> foodList;

	public List<Foods> getFoods() {
		return foodList;
	}
	
}
