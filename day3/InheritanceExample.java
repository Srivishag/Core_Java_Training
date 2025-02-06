package com.celcom.day3;
class Vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
	
}
class Bike1 extends TwoWheeler{
	void brandName() {
		System.out.println("My brand Name is Suzuki");
	}
}

class Bike2 extends TwoWheeler{
	void brandName() {
		System.out.println("My brand Name is Yamaha");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		Bike1 susuki=new Bike1();
		susuki.noOfEngine();
		susuki.noOfWheels();
		susuki.brandName();

		Bike2 yamaha=new Bike2();
		yamaha.noOfEngine();
		yamaha.noOfWheels();
		yamaha.brandName();
	}
}
