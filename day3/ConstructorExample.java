package com.celcom.day3;

public class ConstructorExample {
	String name;
	String model;
	int price;
	String fuel;
	String color;
	
	//constructor
	ConstructorExample(String name, String model, String fuel){
		this.name=name;
		this.model=model;
		this.fuel=fuel;
	}
	
	void display() {
		System.out.println("Bike Name:" + name);
		System.out.println("Bike Model:" + model);
		System.out.println("Bike Fuel:" + fuel);
		System.out.println("Bike Color:" + color);
		System.out.println("Bike Price:" + price);
	}
	void setColorAndPrice(String color,int price) {
		this.color=color;
		this.price=price;
	}
	
	
	public static void main(String[] args) {
		ConstructorExample pulsar=new ConstructorExample("Pulsar","NS200","Petrol");
		pulsar.setColorAndPrice("Black",100000);
		pulsar.display();
		System.out.println();
		
		ConstructorExample pulsar2=new ConstructorExample("Pulsar","NS160","Petrol");
		pulsar2.setColorAndPrice("White",90000);
		pulsar2.display();
		System.out.println();
	}
}
