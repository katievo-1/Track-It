package com.trackit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.trackit.dto.Foods;
import com.trackit.service.TrackitService;

@Controller
public class TrackItController {

	@Autowired
	private TrackitService trackitService;

	/*
	 * private List<Foods> theCalories;
	 * 
	 * @PostConstruct private void loadData() {
	 * 
	 * 
	 * // Create Faculties Foods meal1 = new Foods("Banana",150,1); Foods meal2 =
	 * new Foods("yogurt",300,2); Foods meal3 = new Foods("Chocolate Milk",890,4);
	 * 
	 * //Create our List of Faculties theCalories = new ArrayList<>();
	 * 
	 * 
	 * //Add them to the list theCalories.add(meal1); theCalories.add(meal2);
	 * theCalories.add(meal3);
	 * 
	 * }
	 */

	public TrackItController() {
		trackitService = new TrackitService();
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		return "home";
	}

	@RequestMapping(value = "/calculator", method = RequestMethod.GET)
	public String calculator(Model model) {
		return "calculator";
	}

	@RequestMapping("/searchFoods")
	public ModelAndView searchFoods(
			@RequestParam(value = "searchTerm", required = false, defaultValue = "") String searchTerm) {
		ModelAndView modelAndView = new ModelAndView();

		List<Foods> fetchFood = new ArrayList<Foods>();
		try {
			fetchFood = trackitService.fetchFood(searchTerm);

			fetchFood.removeIf(s -> !s.getDisplayName().contains(searchTerm));
			
			modelAndView.setViewName("home");
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.setViewName("error");
		}

		modelAndView.addObject("foods", fetchFood);

		return modelAndView;
	}
}
