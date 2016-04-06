package com.services;

import org.springframework.stereotype.Service;

import com.beans.Employee;
import com.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	EmployeeDAO empDAO;
	Employee employee;
	
	public EmployeeService(Employee employee){
		this.employee = employee; 
	}
	
	public boolean updateEmployee(){
		empDAO = new EmployeeDAO(employee);
	    return empDAO.saveEmployee();
	}
	
	public Employee getEmployee(Employee employee){
		empDAO = new EmployeeDAO(employee);
		return empDAO.getEmployee();
	}
}

