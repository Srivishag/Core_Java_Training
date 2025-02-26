package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OracleDatabaseExample1 {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	private static String username = "SYSTEM";
	private static String password = "SYSTEM";

	public static void main(String[] args) {
			try {
				Connection con = DriverManager.getConnection(url, username, password);
				String query="INSERT INTO DEMOTABLE(ID,NAME,AGE) VALUES(?,?,?)";
				PreparedStatement st=con.prepareStatement(query);
				st.setInt(1, 1);
				st.setString(2,"SRIVISHAG");
				st.setInt(3,21);
				st.execute();
				Statement sta=con.createStatement();
				query="select * FROM DEMOTABLE";
				ResultSet rs=sta.executeQuery(query);
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getInt(3));
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		
			
			
	}
}
