package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static private String url = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	static private String username = "training";
	static private String password = "Celcom123";

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
