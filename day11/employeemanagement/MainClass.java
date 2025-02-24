package com.celcom.day11.employeemanagement;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EmployeeManager empMan = new EmployeeManager();
		System.out.println("Employee Management System");
		while(true) {
			System.out.println("Choose any of the options");
			System.out.println("1.Add Employee Details");
			System.out.println("2.Remove Employee Details");
			System.out.println("3.Display Employee Details");
			System.out.println("4.Update Employee Details");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			int choice=in.nextInt();
			in.nextLine();
			switch(choice) {
				case 1->empMan.addEmployee();
				case 2->empMan.removeEmployee();
				case 3->empMan.displayEmployeeInfo();
				case 4->empMan.updateEmployee();
				case 5->exit();
					
			}
			
		
		}
	}

	private static void exit() {
		return;
	}
}
