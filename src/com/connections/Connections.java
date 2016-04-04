package com.connections;

import java.sql.Connection;

public interface Connections {
	public Connection connectToDB();
	public void flushConnection();
	public final String propFilePath = "G:\\JavaWorkspace\\DaoExample\\config\\sql.properties";
}
