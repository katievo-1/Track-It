package com.trackit.Service;

import com.trackit.trackitDTO;

public interface TrackitService {

	
	
	trackitDTO fetchbyID(String foodName);
	
	void save(trackitDTO trackitdto);
	
}
