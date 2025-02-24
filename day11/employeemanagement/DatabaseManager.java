package com.celcom.day11.employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
	Database db=new Database();
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	List<Employee> employees;
	Employee emp;
	public int addEmployeeToDatabase(Employee emp) {
		con=db.getConnection();
		String query="INSERT INTO EMPLOYEETABLE(NAME,EMAIL,ADDRESS,AGE) VALUES(?,?,?,?)";
		String query2="SELECT ID FROM EMPLOYEETABLE ORDER BY ID DESC LIMIT 1";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, emp.getName());
			pst.setString(2, emp.getEmail());
			pst.setString(3, emp.getAddress());
			pst.setInt(4, emp.getAge());
			pst.executeUpdate();
			pst=con.prepareStatement(query2);
			rs=pst.executeQuery();
			rs.next();
			return rs.getInt(1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	public void removeEmployeeFromDatabase(int id) {
		con=db.getConnection();
		String query="DELETE FROM EMPLOYEETABLE WHERE ID=?";
		try {
			pst=con.prepareStatement(query);
			pst.setInt(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getEmployeeByAge(int age) {
		// TODO Auto-generated method stub
		con=db.getConnection();
		String query="SELECT * FROM EMPLOYEETABLE WHERE AGE=?";
		try {
			employees=new ArrayList<>();
			pst=con.prepareStatement(query);
			pst.setInt(1,age);
			rs=pst.executeQuery();
			while(rs.next()) {
				int id =rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String address=rs.getString(4);
				employees.add(new Employee(id,name,email,address,age));
			}
			return employees;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
		
	}

	public Employee getEmployeeDetails(int id) {
		con=db.getConnection();
		String query="SELECT * FROM EMPLOYEETABLE WHERE AGE=?";
		try {
			pst=con.prepareStatement(query);
			pst.setInt(1,id);
			rs=pst.executeQuery();
			while(rs.next()) {
				int age =rs.getInt(5);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String address=rs.getString(4);
				return new Employee(id,name,email,address,age);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	

	public void updateEmployeeToDatabase(Employee emp) {
		con=db.getConnection();
		String query = "UPDATE EMPLOYEETABLE SET NAME = ?, EMAIL = ?, ADDRESS = ?, AGE = ? WHERE ID = ?";
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, emp.getName());
			pst.setString(2,emp.getEmail());
			pst.setString(3, emp.getAddress());
			pst.setInt(4,emp.getAge());
			pst.setInt(5,emp.getId());
			pst.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}