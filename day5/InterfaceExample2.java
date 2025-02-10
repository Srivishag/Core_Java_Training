package com.celcom.day5;

interface AnimalPlan{
	void move();
	void eat();
}
abstract class Animal implements AnimalPlan{
	public abstract void move();	
	public abstract void eat();
}

class Cat extends Animal{
	public void move() {
		System.out.println("Cat will move by walking");
	}
	public void eat() {
		System.out.println("Cat will eat Rat");
	}
}

class Parrot extends Animal{
	public void move() {
		System.out.println("Parrot will move by flying");
	}
	public void eat() {
		System.out.println("Parrot will eat Seeds");
	}
}

class Fish extends Animal{
	public void move() {
		System.out.println("Fish will move by swimming");
	}
	public void eat() {
		System.out.println("Fish will eat other fishes");
	}
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		Animal animal ;
		animal = new Cat();
		animal.move();
		animal.eat();
		System.out.println();
		
		animal = new Parrot();
		animal.move();
		animal.eat();
		System.out.println();

		
		animal = new Fish();
		animal.move();
		animal.eat();
		
	}
}

