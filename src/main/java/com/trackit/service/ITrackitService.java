package com.trackit.service;

import java.util.ArrayList;
import java.util.List;

import com.trackit.dto.Foods;

public interface ITrackitService {

	List<Foods> fetchFood(String string) throws Exception;

	List<Foods> matchingFoods = new ArrayList<Foods>();

	Foods findById(int theId);

	void save(Foods foodName);

	void deleteById(int theId);

}
