package com.trackit.dao;

import com.trackit.dto.FoodDisplayTable;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetFoodlist {

	@GET("/Chriscarter17/FoodData/main/FoodTable.json")
	Call<FoodDisplayTable> getAllFoods();

}
