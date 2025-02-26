package com.celcom.day13.Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private String url = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private String username = "training";
	private String password = "Celcom123";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
