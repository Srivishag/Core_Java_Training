package com.celcom.day12;

import java.util.Scanner;

public class CustomerManager {
	Scanner in = new Scanner(System.in);
	DatabaseManager manager = new DatabaseManager();
	public void addCustomer() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("Enter the Name");
		String name=in.nextLine();
		System.out.println("Enter the DOB");
		String dob=in.nextLine();
		System.out.println("Enter the Address");
		String address=in.nextLine();
		System.out.println("Enter the Father Name");
		String fatherName=in.nextLine();
		System.out.println("Enter the Aadhar Number");
		long aadharNumber=in.nextLong();
		in.nextLine();
		System.out.println("Enter the Phone Number");
		int phoneNumber=in.nextInt();
		in.nextLine();
		manager.addCustomer(new Customer(id,name,dob,address,fatherName,aadharNumber,phoneNumber));
		
		
	}

	public void updateCustomer() {
		System.out.println("Enter the Id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("Enter the Name");
		String name=in.nextLine();
		System.out.println("Enter the DOB");
		String dob=in.nextLine();
		System.out.println("Enter the Address");
		String address=in.nextLine();
		System.out.println("Enter the Father Name");
		String fatherName=in.nextLine();
		System.out.println("Enter the Aadhar Number");
		long aadharNumber=in.nextLong();
		in.nextLine();
		System.out.println("Enter the Phone Number");
		int phoneNumber=in.nextInt();
		in.nextLine();
		manager.updateCustomer(new Customer(id,name,dob,address,fatherName,aadharNumber,phoneNumber));
		// TODO Auto-generated method stub
		
	}

	public void removeCustomer() {
		System.out.println("Enter the Id");
		int id=in.nextInt();
		manager.removeCustomer(id);
		// TODO Auto-generated method stub
		
	}

	public void viewCustomer() {
		System.out.println("Enter the id");
		int id=in.nextInt();
		Customer customer=manager.viewCustomer(id);
		System.out.println("Name: "+customer.getName());
		System.out.println("DOB: "+customer.getDob());
		System.out.println("Address: "+customer.getAddress());
		System.out.println("Father Name: "+customer.getFatherName());
		System.out.println("Aadhar Number: "+customer.getAadharNumber());
		System.out.println("Phone Number: "+customer.getPhoneNumber());
		// TODO Auto-generated method stub
		
	}

}