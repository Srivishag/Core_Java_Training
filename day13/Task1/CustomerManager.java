package com.celcom.day13.Task1;

import java.util.List;
import java.util.Scanner;

public class CustomerManager {
	Scanner in = new Scanner(System.in);
	DatabaseManager manager = new DatabaseManager();
	void addCustomer() {
		System.out.println("Enter the Id : ");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("Enter the Name : ");
		String name = in.nextLine();
		System.out.println("Enter the Account Number : ");
		long accountNumber=in.nextLong();
		System.out.println("Enter the Initial Balance : ");
		double balance = in.nextDouble();
		manager.addCustomer(new Customer(id,name,accountNumber,balance));
		System.out.println("Customer Added Successfully ✅");
	}
	
	void deleteCustomer() {
		System.out.println("Enter the Customer id : ");
		int id = in.nextInt();
		manager.deleteCustomer(id);
	}
	
	void deposit() {
		System.out.println("Enter the Customer Id");
		int id=in.nextInt();
		System.out.println("Enter the Amount to be Deposited : ");
		double amount=in.nextDouble();
		double balance = manager.getBalance(id);
		manager.updateCustomer(id,balance+amount);
		System.out.println("Deposit Completed");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void withdraw() {
		System.out.println("Enter the Customer Id");
		int id=in.nextInt();
		System.out.println("Enter the Amount to be Withdraw : ");
		double amount=in.nextDouble();
		double balance = manager.getBalance(id);
		manager.updateCustomer(id,balance-amount);
		System.out.println("Withdraw Completed");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	void displayAllCustomer() {
		System.out.println("Customer List :");
		List<Customer> customerList = manager.getCustomerList(); 
		for(Customer customer:customerList) {
			System.out.println("ID : " + customer.getId());
			System.out.println("Name : " + customer.getName());
			System.out.println("Account Number : " + customer.getAccountNumber());
			System.out.println("Balance : " + customer.getBalance());
		}
	}
	void displayCustomerByBalance() {
		System.out.println("Enter the Balance:");
		int balance = in.nextInt();
		System.out.println("Customer List :");
		List<Customer> customerList = manager.getCustomerList(balance); 
		for(Customer customer:customerList) {
			System.out.println("ID : " + customer.getId());
			System.out.println("Name : " + customer.getName());
			System.out.println("Account Number : " + customer.getAccountNumber());
			System.out.println("Balance : " + customer.getBalance());
		}
	}
	
	
}
