package com.trackit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trackit.dto.Foods;

import Trackit_DAO.IFoodsDAO;

//Service layer

@Component
public class ITrackitService implements TrackitService {
	
	
	IFoodsDAO FoodDAO;
	
	@Override
	public List<Foods> fetchFood(String searchTerm) throws Exception {
		// TODO Auto-generated method stub
		return FoodDAO.fetch(searchTerm);
	}

	@Override
	public Foods findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Foods foodName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
