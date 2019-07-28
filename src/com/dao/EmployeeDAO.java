package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Employee;
import com.connections.Connections;
import com.dbfactory.MySqlConnectionFactory;

public class EmployeeDAO {

	Employee employee;
	Connections connection;
	
	public EmployeeDAO(Employee employee){
		this.employee = employee;
	}
	
	public boolean saveEmployee(){
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
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	public Employee getEmployee(){
		MySqlConnectionFactory connectDB = new MySqlConnectionFactory();
		//Connection connection = connectDB.connectToDB();
		Connection connection = connectDB.getConnection().connectToDB();
		
		PreparedStatement statement;
		try{
			statement = (PreparedStatement) connection.prepareStatement("Select * from employeeinfo where employeeID=?");
			statement.setInt(1, (int) employee.getId());
			ResultSet recordSet = statement.executeQuery();
			
			recordSet.first();
			employee.setId(recordSet.getInt("employeeID"));
			employee.setName(recordSet.getString("employeeName"));
			employee.setContactNumber(recordSet.getString("employeeContact"));
			return employee;
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}
	}
	
}
