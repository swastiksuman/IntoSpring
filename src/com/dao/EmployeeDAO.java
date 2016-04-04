package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Employee;
import com.connections.Connections;
import com.dbfactory.MySqlConnectionFactory;
import com.mysql.jdbc.PreparedStatement;


public class EmployeeDAO {

	Employee employee;
	Connections connection;
	
	public EmployeeDAO(Employee employee){
		this.employee = employee;
	}
	
	public void saveEmployee(){
		MySqlConnectionFactory connectDB = new MySqlConnectionFactory();
		//Connection connection = connectDB.connectToDB();
		Connection connection = connectDB.getConnection().connectToDB();
		
		PreparedStatement statement;
		try {
			statement = (PreparedStatement) connection.prepareStatement("Insert into employeeinfo (employeeID, employeeName, employeeContact) values (?,?,?)");
			statement.setInt(1, (int) employee.getId());
			statement.setString(2, employee.getName());
			statement.setString(3, employee.getContactNumber());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
