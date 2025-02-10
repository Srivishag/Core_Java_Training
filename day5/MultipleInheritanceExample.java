package com.celcom.day5;

interface InterfaceOne{
	int a=10; // By default public static final
	void addition();
}

interface InterfaceTwo{
	int a=20; //By default public static final
	void addition();
}

interface InterfaceThree extends InterfaceOne,InterfaceTwo{
	void addition() ;
	
}

class Addition implements InterfaceThree{
	public void addition() {
		System.out.println("Addition using Multiple Inheritance " + (InterfaceOne.a+InterfaceTwo.a));
	}
}

public class MultipleInheritanceExample {
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.addition();
	}
}
