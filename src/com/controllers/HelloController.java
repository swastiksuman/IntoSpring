package com.controllers;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.beans.Employee;
import com.dao.EmployeeDAO;
import com.services.EmployeeService;

@Controller
public class HelloController{
	static Logger logger = Logger.getLogger(HelloController.class);
	
   @RequestMapping(value ="/employee", method = RequestMethod.GET)
   public String showForm() {
	   logger.error("In Employee Page");
      return "employee";
   }
   
   @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
   @ResponseBody
   public String submit(@RequestParam("name") String name, ModelMap model) {
	   logger.error("Employee "+name);
	   System.out.println(name);
       Employee employee = new Employee();
	   model.addAttribute("name", employee.getName());
       model.addAttribute("contactNumber", employee.getContactNumber());
       model.addAttribute("id", employee.getId());
       EmployeeService employeeService = new EmployeeService(employee);
       employeeService.updateEmployee();
       return "<h1>ASDASD</h1>";
   }


}