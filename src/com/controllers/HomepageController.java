package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/index", ""})
public class HomepageController {
	@RequestMapping(method=RequestMethod.GET)
	public String welcomeHome(ModelMap model){		
		return "index";
	}
}
