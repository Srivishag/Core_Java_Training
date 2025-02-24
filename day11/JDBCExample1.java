package com.celcom.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample1 {
	private static String url = "jdbc:mysql://localhost:3306/demo";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			
			//drop if table exists
			String query = "DROP TABLE IF EXISTS DEMOTABLE;";
			PreparedStatement statement = con.prepareStatement(query);
			statement.executeUpdate();
			
			//create a new table
			query = "CREATE TABLE DEMOTABLE(ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(20), AGE INT)";
			statement = con.prepareStatement(query);
			statement.executeUpdate();
			
			//scanner object
			Scanner in = new Scanner(System.in);
			
			//user input
			System.out.println("Enter the number of data");
			int n = in.nextInt();
			in.nextLine();
			for (int i = 0; i < n; i++) {
				System.out.println("Name:");
				String name = in.nextLine().trim();
				System.out.println("Age:");
				int age = in.nextInt();
				in.nextLine();
				
				//inserting into table
				query = "INSERT INTO DEMOTABLE(NAME,AGE) VALUES(?,?)";
				statement = con.prepareStatement(query);
				statement.setString(1, name);
				statement.setInt(2, age);
				statement.executeUpdate();
			}
			
			//printing from the database
			Statement st = con.createStatement();
			query = "SELECT * FROM DEMOTABLE";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("|" + rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getInt(3) + "|");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
};