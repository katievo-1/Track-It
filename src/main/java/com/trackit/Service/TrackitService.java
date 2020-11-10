package com.trackit.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.trackit.dto.Foods;




@Component
public interface TrackitService {

	
public List<Foods> fetchFood(String string) throws Exception;

	List<Foods> matchingFoods = new ArrayList<Foods>();
	
	
	public Foods findById(int theId);
	
	public void save(Foods foodName);
	
	public void deleteById (int theId);
	
}
