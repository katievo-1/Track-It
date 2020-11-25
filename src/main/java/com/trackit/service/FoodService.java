package com.trackit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trackit.dao.FoodRepository;
import com.trackit.dto.Food;

@Service
public class FoodService implements IFoodService {

	public FoodRepository foodRepository;

	@Autowired
	public FoodService(FoodRepository theFoodRepository) {
		foodRepository = theFoodRepository;
	}

	@Override
	public List<Food> findAll() {
		return foodRepository.findAllByOrderByFoodNameAsc();
	}

	@Override
	public Food findById(int theId) {
		Optional<Food> foodId = foodRepository.findById(theId);

		Food theFood = null;

		if (foodId.isPresent()) {
			theFood = foodId.get();

		} else {
			// food not found
			throw new RuntimeException("The FoodId you've entered is invalid - " + theId);
		}

		return theFood;
	}

	@Override
	public void save(Food theFood) {
		foodRepository.save(theFood);

	}

	@Override
	public void deleteById(int theId) {
		foodRepository.deleteById(theId);
	}

}
