package com.celcom.saturday_assignment_08_feb_2025;

class Vehicle{
	void drive() {
		System.out.println("Running a Car");
	}
}

class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a Car");
	}
}

public class Assignment9 {

	public static void main(String[] args) {
		Vehicle car=new Car();
		car.drive();

	}

}
