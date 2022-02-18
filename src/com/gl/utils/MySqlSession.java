package com.gl.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySqlSession {

	private final String URL="jdbc:mysql://localhost:3306/bd";
	private final String USER="root";
	private final String PWP="";

	private Connection connection;
	private static MySqlSession instance=null;
	private MySqlSession() {
		
	}
	public static MySqlSession getInstance() throws SQLException {
		if(instance==null)
			instance=new MySqlSession();
		return instance;
	}
	public Connection getConnection() throws SQLException {
		if(connection==null || connection.isClosed())
			connection=DriverManager.getConnection(URL,USER,PWP);
		return connection;
	}
}
