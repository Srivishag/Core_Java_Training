package com.celcom.day11.employeemanagement;

import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	Employee emp;
	Scanner in = new Scanner(System.in);
	DatabaseManager manager = new DatabaseManager();
	public void addEmployee() {
		System.out.println("Enter Employee Name:");
		String name=in.nextLine();
		System.out.println("Enter Employee Email");
		String email=in.next();
		in.nextLine();
		System.out.println("Enter Employee Address");
		String address=in.nextLine();
		System.out.println("Enter Employee Age");
		int age=in.nextInt();
		emp=new Employee(0,name,email,address,age);
		int id=manager.addEmployeeToDatabase(emp);
		System.out.println("Id of the Employee is"+id);
		
		
	}

	public void removeEmployee() {
		System.out.println("Enter your Employee Id");
		int id=in.nextInt();
		manager.removeEmployeeFromDatabase(id);
		System.out.println("Employee Removed Successfully");
	}

	public void displayEmployeeInfo() {
		System.out.println("1.Display by Age\n 2.Display by ID");
		int choice=in.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Employee Age");
			int age=in.nextInt();
			List<Employee> employees=manager.getEmployeeByAge(age);
			for(Employee emp:employees) {
				System.out.println("Id:"+emp.getId());
				System.out.println("Name:"+emp.getName());
				System.out.println("Email:"+emp.getEmail());
				System.out.println("Address:"+emp.getAddress());
				System.out.println("Age:"+emp.getAge());
				
			}
			break;
		case 2:
			System.out.println("Enter Employee Id");
			int id=in.nextInt();
			emp=manager.getEmployeeDetails(id);
			if(emp==null) {
				System.out.println("Id not found");
				break;
			}
			System.out.println("Id:"+emp.getId());
			System.out.println("Name:"+emp.getName());
			System.out.println("Email:"+emp.getEmail());
			System.out.println("Address:"+emp.getAddress());
			System.out.println("Age:"+emp.getAge());
		}
		// TODO Auto-generated method stub
	}

	public void updateEmployee() {
		System.out.println("Enter the id");
		int id=in.nextInt();
		in.nextLine();
		System.out.println("Enter Employee Name:");
		String name=in.nextLine();
		System.out.println("Enter Employee Email");
		String email=in.next();
		in.nextLine();
		System.out.println("Enter Employee Address");
		String address=in.nextLine();
		System.out.println("Enter Employee Age");
		int age=in.nextInt();
		emp=new Employee(id,name,email,address,age);
		manager.updateEmployeeToDatabase(emp);
	
		// TODO Auto-generated method stub
	}

}
