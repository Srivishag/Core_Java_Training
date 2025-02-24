package com.celcom.day11.employeemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	static private String url="jdbc:mysql://localhost:3306/demo";
	static private String username="root";
	static private String password="root";
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
}
