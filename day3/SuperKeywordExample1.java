package com.celcom.day3;
class SuperVehicle {
	String name="I am a Super Class Variable";
	
	SuperVehicle(){
		System.out.println("I am a Super Class Constructor");
	}
	
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class SuperTwoWheeler extends SuperVehicle{
	SuperTwoWheeler(){
		super();
	}
	void noOfWheels() {
		super.noOfEngine();
		System.out.println("I have two wheels");
		System.out.println(super.name);
	}
	
}


public class SuperKeywordExample1 {
	public static void main(String[] args) {
		SuperTwoWheeler bike=new SuperTwoWheeler();
		bike.noOfWheels();
		
	}
}
