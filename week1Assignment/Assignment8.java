package com.celcom.week1Assignment;

class Animal {
	void makeSound(){
		System.out.println("Make Sounds");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow Bark");
	}
}
public class Assignment8{
		public static void main(String[] args) {
			Animal obj=new Cat();
			obj.makeSound();
	}
}



