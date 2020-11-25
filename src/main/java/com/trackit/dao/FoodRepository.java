package com.trackit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trackit.dto.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

	//Method to sort the result by name ascending
	public List<Food>findAllByOrderByFoodNameAsc();
}
