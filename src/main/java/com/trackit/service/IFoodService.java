package com.trackit.service;

import java.util.List;

import com.trackit.dto.Food;

public interface IFoodService {

	public List<Food> findAll();
	
	public Food findById(int theId);
	
	public void save(Food theFaculty);
	
	public void deleteById (int theId);
	
}


