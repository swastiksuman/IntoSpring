package com.controllers;

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
 
   @RequestMapping(value ="/employee", method = RequestMethod.GET)
   public String showForm() {
      return "employee";
   }
   
   @RequestMapping(value = "/addEmployee", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
   public String submit(@RequestBody Employee employee, ModelMap model) {
       model.addAttribute("name", employee.getName());
       model.addAttribute("contactNumber", employee.getContactNumber());
       model.addAttribute("id", employee.getId());
       EmployeeService employeeService = new EmployeeService(employee);
       employeeService.updateEmployee();
       return "addEmployee";
   }


}