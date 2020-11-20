package com.trackit.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trackit.dao.IFoodsDAO;
import com.trackit.dto.Foods;

@Component("trackitService")
public class TrackitService implements ITrackitService {

	@Autowired
	private IFoodsDAO foodDAO;

	@Override
	public List<Foods> fetchFood(String searchTerm) throws Exception {
		return foodDAO.fetch(searchTerm);
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