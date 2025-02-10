package com.celcom.day5;

interface VehiclePlan1 {
	int a=0;
	void noOfEngine();
	void noOfWheels();

	
}

interface VehiclePlan2{
	 void brandName();
}

abstract class Vehicles implements VehiclePlan1,VehiclePlan2{
	public void noOfEngine() {
		System.out.println("I have one Wheel");
	}
}

class Bike extends Vehicles{
	public void noOfWheels() {
		System.out.println("I have four wheels");
	}

	public void brandName() {
		System.out.println("My Brand Name is Benz");		
	}
}

public class InterfaceExample1 {
		public static void main(String[] args) {
			Bike obj=new Bike();  
			obj.noOfWheels();
			obj.brandName();
			System.out.println(VehiclePlan1.a);
		}
}
