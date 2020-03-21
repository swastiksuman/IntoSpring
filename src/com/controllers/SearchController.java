package com.controllers;

import java.util.ArrayList;
import java.util.List;

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
	
	@RequestMapping(value="/getAll", method = RequestMethod.GET)
	public String getAll(ModelMap model){
		model.addAttribute("employeeList", EmployeeService.employeeList);
		return "searchResult";
	}
	
	@RequestMapping(value = "/searchResult", method = RequestMethod.POST)
	public String search(@ModelAttribute("employee")Employee employee, 
     BindingResult result, ModelMap model){
		
		EmployeeService empService = new EmployeeService(employee);
		List<Employee> employeeList = new ArrayList<Employee>();
		if(employee.getId()>0) {
		employee = empService.getEmployee(employee);
		employeeList.add(employee);
		model.addAttribute("employeeList", employeeList);
		}else {
			for(Employee e: empService.getAllEmployee()) {
				System.out.println(e.getName());
			}
			model.addAttribute("employeeList", empService.getAllEmployee());
		}
	    return "searchResult";
	}
}
