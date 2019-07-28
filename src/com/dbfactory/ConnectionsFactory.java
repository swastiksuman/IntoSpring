package com.dbfactory;

import com.connections.Connections;

public interface ConnectionsFactory {
	
	public Connections getConnection();
	public Connections destroyConnection();
}
