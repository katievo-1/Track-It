package com.trackit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrackItController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {		
		return "index";
	}
}


