package com.trackit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.trackit.dto.Food;
import com.trackit.dto.Foods;
import com.trackit.service.FoodService;
import com.trackit.service.TrackitService;

@Controller
public class TrackItController {

	public FoodService foodService;
	
	@Autowired
	private TrackitService trackitService;

	public TrackItController(FoodService theFoodService) {
		foodService = theFoodService;
		trackitService = new TrackitService();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@RequestParam(value = "searchTerm", required = false, defaultValue = "") String searchTerm, Model model) {
		Food food= new Food();

		//Retrieve faculties from the Database
		List<Food> foods = foodService.findAll();	

		//Add faculties to the Spring Model
		model.addAttribute("foodList", foods);
		
		model.addAttribute("food", food);
		
		List<Foods> fetchFood = new ArrayList<Foods>();
		
		if(searchTerm != null && !searchTerm.isEmpty()) {
			try {
				fetchFood = trackitService.fetchAllFoods();

				fetchFood.removeIf(s -> !s.getDisplayName().contains(searchTerm));
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		model.addAttribute("foods", fetchFood);
		
		return "home";
	}
	
	@PostMapping("/save")
	public String saveFood(@ModelAttribute("food") Food food) {
		
		//Register the Food
		foodService.save(food);
		
		//Block duplicate submission for accident page refresh
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("foodId")int theId) {
		
		//Remove food item
		foodService.deleteById(theId);
		
		//Redirect to the home
		return "redirect:/";
		
	}
}
