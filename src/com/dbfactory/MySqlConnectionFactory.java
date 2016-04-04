package com.dbfactory;


import com.connections.ConnectMySql;
import com.connections.Connections;
import com.mysql.jdbc.Connection;

public class MySqlConnectionFactory implements ConnectionsFactory{

	@Override
	public  Connections getConnection() {
		return new ConnectMySql();
	}

	@Override
	public Connections destroyConnection() {
		return null;
	}

}
