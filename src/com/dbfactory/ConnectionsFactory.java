package com.dbfactory;

import com.connections.Connections;
import com.mysql.jdbc.Connection;

public interface ConnectionsFactory {
	
	public Connections getConnection();
	public Connections destroyConnection();
}
