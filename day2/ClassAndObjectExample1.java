package com.celcom.day2;

class Employee {
	//Variable Declaration
	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employee(int eid, String ename, double esalary){
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	//Method
	void display() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " +  esalary +  " \n");
	}
}

public class ClassAndObjectExample1{
	public static void main(String[] args) {
		Employee vishag = new Employee(101,"Srivishag P",15000);
		vishag.display();
		
		Employee ranjith = new Employee(102,"Ranjith Mohan",15000);
		ranjith.display();
	}
}
