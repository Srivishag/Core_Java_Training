package com.celcom.day5;

abstract class Vehicle {
	
	int num;
	Vehicle(int num){
		this.num=num;
	}
	
	void noOfEngine() {
		System.out.println("I have "+num+" Engine");
	}
	
	abstract void noOfWheels();
	
	abstract void brandName();
	
	abstract void brandName(String name);

	
}

class Car extends Vehicle{
	
	Car(){
		super(1);
	}
	
	void noOfWheels() {
		System.out.println("I have four wheels");
	}
	
	void brandName() {
		System.out.println("My Brand Name is Volvo");
		
	}
	
	void brandName(String Name) {
		System.out.println("My Brand Name is " + Name);
		
	}
}

public class AbstractClassExample1 {
	public static void main(String[] args) {
		Vehicle vec=new Car();
		vec.brandName();
		vec.noOfWheels();
		vec.noOfEngine();
	}

}
