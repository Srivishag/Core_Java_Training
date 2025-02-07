package com.celcom.day4;

class Vehicle{
	void engine() {
		System.out.println("All vehicle have a Engine");
	}
	
	void wheels() {
		System.out.println("All vehicle have Wheels");
	}
}

class Wheels{
	void wheelModel() {
		System.out.println("Wheel model is MRF");
	}
	
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have Two Wheels");
		}
		else if(vehicleType.equals("Four Wheeler")) {
			System.out.println("I have Four Wheels");
		}
	}
}

class Engine{
	void engineModel() {
		System.out.println("Engine model is B12");
	}
}


class Car extends Vehicle{ 	//IS A RELATIONSHIP
	Wheels wheel=new Wheels(); 	//HAS A RELATIONSHIP
	Engine engine=new Engine();	//HAS A RELATIONSHIP
	void engineModel() {
		engine.engineModel();
	}
	void wheelModel() {
		wheel.wheelModel();
	}
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}

public class IsAHasARelationship {
	public static void main(String[] args)
	{
		Car car=new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
	}
	
}
