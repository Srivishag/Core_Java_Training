package com.celcom.day4;

class Animal{
	void move() {
		System.out.println("Can not define");
	}
	void eat() {
		System.out.println("Can not define");
	}
}

class Cat extends Animal{
	void move() {
		System.out.println("Cat will move by walking");
	}
	void eat() {
		System.out.println("Cat will eat Rat");
	}
}

class Parrot extends Animal{
	void move() {
		System.out.println("Parrot will move by flying");
	}
	void eat() {
		System.out.println("Parrot will eat Seeds");
	}
}

class Fish extends Animal{
	void move() {
		System.out.println("Fish will move by swimming");
	}
	void eat() {
		System.out.println("Fish will eat other fishes");
	}
}

public class MethodOverridingExample2 {
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
