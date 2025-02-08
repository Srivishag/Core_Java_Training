package com.celcom.week1Assignment;

import java.util.Scanner;

class Employee {
	String name;
	String jobTitle;
	double salary;
	Employee(String name,String jobTitle,double salary){
		this.name=name;
		this.jobTitle=jobTitle;
		this.salary=salary;
	}
	
	void calculate() {
		System.out.format("Monthly Salary is : %.2f \n" , salary/12 );
	}
	
	void update(double salary) {
		this.salary=salary;
		System.out.format("Updated Salary : %.2f \n",salary);
	}
	
	void display() {
		System.out.println("Employee information");
		System.out.println("Name :" + name);
		System.out.println("Job Title : "+ jobTitle);
		System.out.println("Salary : "+ salary);
	}
}
public class Assignment6{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Employee Information");
		System.out.println("Name :");
		String name=in.next();
		System.out.println("Job Title :");
		String jobTitle=in.next();
		System.out.println("Salary :");
		double salary=in.nextDouble();
		Employee emp=new Employee(name,jobTitle,salary);
		emp.display();
		emp.calculate();
		System.out.println("Enter the Update Salary: ");
		int updatedSalary=in.nextInt();
		emp.update(updatedSalary);
		emp.calculate();
		in.close();
	}
	
	
}
