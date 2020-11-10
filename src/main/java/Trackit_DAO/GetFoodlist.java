package Trackit_DAO;



import com.trackit.dto.FoodList;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetFoodlist {

	@GET("/Chriscarter17/FoodData/main/FoodTable.json")
	Call<FoodList> getAllFoods(@Query("Display_name") String foodname);
	
}
