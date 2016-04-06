package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Employee;
import com.services.EmployeeService;

@Controller
public class SearchController {
	
	@RequestMapping(value ="/search", method = RequestMethod.GET)
	public ModelAndView showSearchForm(){
		return new ModelAndView("search","employee",new Employee());
	}
	
	@RequestMapping(value = "/searchResult", method = RequestMethod.POST)
	public String search(@ModelAttribute("employee")Employee employee, 
     BindingResult result, ModelMap model){
		
		EmployeeService empService = new EmployeeService(employee);
		employee = empService.getEmployee(employee);
		model.addAttribute("name", employee.getName());
	    model.addAttribute("contactNumber", employee.getContactNumber());
	    model.addAttribute("id", employee.getId());
	    
	    return "searchResult";
	}

}
