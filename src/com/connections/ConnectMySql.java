package com.connections;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class ConnectMySql implements Connections{
	
	Connection connection;
	Statement statement;
	
	
	public ConnectMySql(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties prop = new Properties();
			//prop.load(new FileInputStream(propFilePath));
			String connectionURL = "jdbc:mysql://localhost:3306/employeedb";
			String username = "root";
			String password = "mysql@123";
			connection=DriverManager.getConnection(connectionURL,username,password); 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}	
	}
	
	@Override
	public Connection connectToDB() {
		return connection;
	}
	
	public ResultSet executeQuery(String statement){
		return null;
	}

	@Override
	public void flushConnection() {
		connection = null;
	}
}