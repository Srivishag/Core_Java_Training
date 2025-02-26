package com.celcom.day13.Task1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
	DatabaseConnection connection = new DatabaseConnection();

	public void addCustomer(Customer customer) {
		try (Connection con = connection.getConnection();) {
			String query = "INSERT INTO CUSTOMER_SV_TWO(ID,NAME,ACCOUNTNUM,BALANCE) VALUES(?,?,?,?)";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setLong(3, customer.getAccountNumber());
			statement.setDouble(4, customer.getBalance());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Invalid Id Try again");
		}
	}

	public void deleteCustomer(int id) {
		try (Connection con = connection.getConnection()) {
			String query = "DELETE FROM CUSTOMER_SV_TWO WHERE ID = ?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<>();
		try (Connection con = connection.getConnection()) {
			String query = "SELECT * FROM CUSTOMER_SV_TWO";
			PreparedStatement statement = con.prepareStatement(query);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				long accountNumber = rs.getLong(3);
				double balance = rs.getDouble(4);
				customerList.add(new Customer(id, name, accountNumber, balance));
			}
			return customerList;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}

	public List<Customer> getCustomerList(int balance) {
		List<Customer> customerList = new ArrayList<>();
		try (Connection con = connection.getConnection()) {
			String query = "SELECT * FROM CUSTOMER_SV_TWO WHERE BALANCE>=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setDouble(1, balance);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				long accountNumber = rs.getLong(3);
				customerList.add(new Customer(id, name, accountNumber, balance));
			}
			return customerList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}

	public double getBalance(int id) {
		try (Connection con = connection.getConnection()) {
			String query = "SELECT BALANCE FROM CUSTOMER_SV_TWO WHERE ID=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void updateCustomer(int id, double balance) {
		try(Connection con = connection.getConnection()){
			String query = "UPDATE CUSTOMER_SV_TWO SET BALANCE = ? WHERE ID = ?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setDouble(1, balance);
			statement.setInt(2, id);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
