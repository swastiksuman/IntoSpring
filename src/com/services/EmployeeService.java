package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beans.Employee;
import com.dao.EmployeeDAO;

@Service
public class EmployeeService {
	
	EmployeeDAO empDAO;
	Employee employee;
	public static List<Employee> employeeList = new ArrayList<Employee>();
	
	public EmployeeService(Employee employee){
		this.employee = employee; 
	}
	
	public boolean updateEmployee(){
//		empDAO = new EmployeeDAO(employee);
//	    return empDAO.saveEmployee();
		employeeList.add(employee);
		return true;
	}
	
	public Employee getEmployee(Employee employee){
		/*
		 * empDAO = new EmployeeDAO(employee); return empDAO.getEmployee();
		 */
		return employeeList.get(0);
	}
	
	public List<Employee> getAllEmployee(){
		return employeeList;
	}
}

