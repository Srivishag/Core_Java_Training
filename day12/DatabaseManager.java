package com.celcom.day12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManager {
	Customer customer;
	DatabaseConnection connector = new DatabaseConnection();

	public void addCustomer(Customer customer) {
		try (Connection con = connector.getConnection()) {
			String query = "INSERT INTO CUSTOMER_SV(ID,NAME,DOB,ADDRESS,FNAME,AADHARNUM,PHONENUM) VALUES(?,?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setString(3, customer.getDob());
			statement.setString(4, customer.getAddress());
			statement.setString(5, customer.getFatherName());
			statement.setLong(6, customer.getAadharNumber());
			statement.setInt(7, customer.getPhoneNumber());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateCustomer(Customer customer) {
		try (Connection con = connector.getConnection()) {
			String query = "UPDATE CUSTOMER_SV SET NAME=?,DOB=?,ADDRESS=?,FNAME=?,AADHARNUM=?,PHONENUM=? WHERE ID=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(7, customer.getId());
			statement.setString(1, customer.getName());
			statement.setString(2, customer.getDob());
			statement.setString(3, customer.getAddress());
			statement.setString(4, customer.getFatherName());
			statement.setLong(5, customer.getAadharNumber());
			statement.setInt(6, customer.getPhoneNumber());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void removeCustomer(int id) {
		try (Connection con = connector.getConnection()) {
			String query = "DELETE FROM CUSTOMER_SV WHERE ID=? ";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Customer viewCustomer(int id) {
		try (Connection con = connector.getConnection()) {
			String query = "SELECT * FROM CUSTOMER_SV WHERE ID =?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				String name = rs.getString(2);
				String dob = rs.getString(3);
				String address = rs.getString(4);
				String fatherName = rs.getString(5);
				long aadharNumber = rs.getLong(6);
				int phoneNumber = rs.getInt(7);
				return new Customer(id, name, dob, address, fatherName, aadharNumber, phoneNumber);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customer;

	}
}
