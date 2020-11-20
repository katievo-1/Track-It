package com.trackit.dao;

import java.util.List;
import com.trackit.dto.Foods;

public interface IFoodsDAO {

	List<Foods> fetch(String searchFilter) throws Exception;

}