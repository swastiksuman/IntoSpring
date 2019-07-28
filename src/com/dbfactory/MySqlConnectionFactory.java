package com.dbfactory;


import com.connections.ConnectMySql;
import com.connections.Connections;

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
