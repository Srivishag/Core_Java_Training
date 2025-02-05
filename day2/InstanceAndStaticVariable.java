package com.celcom.day2;

//Instance vs Static
public class InstanceAndStaticVariable {
	int a = 10; //Instance Variable
	static int b=20; //Static Variable
	public static void main(String args[]) {
		InstanceAndStaticVariable obj1 = new InstanceAndStaticVariable();
		InstanceAndStaticVariable obj2 = new InstanceAndStaticVariable();
		
		//Instance Variable Checking
		System.out.println(obj1.a); //10
		System.out.println(obj2.a); //10
		
		obj1.a = 20;
		
		System.out.println(obj1.a); //20
		System.out.println(obj2.a); //10
		
		//Static Variable Checking
		System.out.println(b); //20
		

		
	}
	
}
