package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.AthleteDao;
import com.manipal.model.Athlete;
//import com.manipal.model.User;


@Controller
public class AtheleteController {
	@Autowired
	AthleteDao athleteado;
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView greet() {
		ModelAndView modelAndView = new ModelAndView("greeting");
		return modelAndView;
	}
	@RequestMapping(value="/userform", method=RequestMethod.GET)
	public String getForm() {
		return "userform";
	}
	@RequestMapping(value="/addAthlete", method=RequestMethod.POST)
	public String add(@ModelAttribute Athlete athlete) {
		athleteado.addAthlete(athlete);
		return "added";
	}
	
//edit the method
	@RequestMapping(value="/added", method=RequestMethod.GET)
	public ModelAndView added() {
		
		ModelAndView modelAndView = new ModelAndView("added");
		return modelAndView;
	}
	
	@RequestMapping(value="/details", method=RequestMethod.GET)
	public ModelAndView viewAthlete() {
		List<Athlete> Athletes = athleteado.showAthlete();
		return new ModelAndView("userdetails", "Athletes", Athletes);
	}
	
}
