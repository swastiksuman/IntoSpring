package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.beans.Employee;
import com.dao.EmployeeDAO;

@Controller
public class HelloController{
 
   @RequestMapping(value ="/employee", method = RequestMethod.GET)
   public ModelAndView showForm() {
      return new ModelAndView("employee","employee", new Employee());
   }
   
   @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
   public String submit(@ModelAttribute("employee")Employee employee, 
     BindingResult result, ModelMap model) {
       if (result.hasErrors()) {
           return "error";
       }
       model.addAttribute("name", employee.getName());
       model.addAttribute("contactNumber", employee.getContactNumber());
       model.addAttribute("id", employee.getId());
       EmployeeDAO emp = new EmployeeDAO(employee);
       emp.saveEmployee();
       
       return "addEmployee";
   }


}