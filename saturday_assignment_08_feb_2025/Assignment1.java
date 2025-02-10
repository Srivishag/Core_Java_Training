package com.celcom.saturday_assignment_08_feb_2025;

class Person {
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
public class Assignment1{
	public static void main(String[] args) {
		Person srivishag = new Person("Srivishag",21);
		Person mohan = new Person("Mohan Kumar",21);
		srivishag.display();
		mohan.display();

	}
}
