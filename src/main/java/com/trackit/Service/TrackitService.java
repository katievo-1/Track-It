package com.trackit.Service;

import java.util.List;

import com.trackit.dto.trackitDTO;





public interface TrackitService {

	
public List<trackitDTO> findAll();
	
	public trackitDTO findById(int theId);
	
	public void save(trackitDTO foodName);
	
	public void deleteById (int theId);
	
}
