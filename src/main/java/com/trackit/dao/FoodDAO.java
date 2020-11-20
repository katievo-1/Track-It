package com.trackit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trackit.dto.FoodDisplayTable;
import com.trackit.dto.Foods;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

@Component("foodDAO")
public class FoodDAO implements IFoodsDAO {

	@Autowired
	NetworkDAO networkDAO;

	@Override
	public List<Foods> fetch(String searchFilter) throws Exception {

		// using retrofit to parse data from json
		Retrofit retrofit = new Retrofit.Builder().baseUrl("https://raw.githubusercontent.com")
				.addConverterFactory(GsonConverterFactory.create()).build();
		GetFoodlist getFoods = retrofit.create(GetFoodlist.class);

		Call<FoodDisplayTable> allFoods = getFoods.getAllFoods();
		Response<FoodDisplayTable> execute = allFoods.execute();
		FoodDisplayTable foods = execute.body();
		
		return foods.getFoodDisplayTable().getFoods();
	}
}
