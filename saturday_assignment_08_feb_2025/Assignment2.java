package com.celcom.saturday_assignment_08_feb_2025;
class Dog {
	int number;
	String name;
	String breed;
	Dog(int number, String name,String breed){
		this.number=number;
		this.name=name;
		this.breed=breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	void display() {
		System.out.println("Dog Number : "+ number);
		System.out.println("Dog : " + name);
		System.out.println("Breed : " + breed + "\n");
	}
}

public class Assignment2{
	public static void main(String[] args) {
		Dog dog1=new Dog(1,"Bruno","Pug");
		Dog dog2=new Dog(2,"Kumar","German Shepard");
		dog1.display();
		dog2.display();
		
		
		//Changing the Attributes
		dog1.setBreed("Labrador");
		dog1.setName("Coco");
		dog1.display();
		
		dog2.setBreed("Husky");
		dog2.setName("Vanilla");
		dog2.display();
		
	}

}
