package Trackit_DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.trackit.dto.FoodList;
import com.trackit.dto.Foods;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

@Component
public class FoodDAO implements IFoodsDAO {
	
	@Autowired
	NetworkDAO networkDAO;
	
		@Override
		public List<Foods> fetch(String searchFilter) throws Exception{
		
			//using retrofit to parse data from json
			Retrofit retrofit = new Retrofit.Builder()
					.baseUrl("https://raw.githubusercontent.com")
					
					.build();
			GetFoodlist getFoods = retrofit.create(GetFoodlist.class);
			
			Call<FoodList> allFoods = getFoods.getAllFoods(searchFilter);
			Response<FoodList> execute = allFoods.execute();
			FoodList foods = execute.body();
			return foods.getFoods();
		}
}
