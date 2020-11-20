package com.trackit.dto;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FoodDisplayTable {

	@SerializedName("Food_Display_Table")
	@Expose
	public FoodList foodDisplayTable;
	
	public FoodList getFoodDisplayTable() {
		return foodDisplayTable;
	}

}
