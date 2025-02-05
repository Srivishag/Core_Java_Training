package com.celcom.day2;

public class TypesOfMethod {
	
	void m1() {
		System.out.println("Instance Method");
	}
	
	static void m2() {
		System.out.println("Static Method");
	}
	public static void main(String args[]) {
		TypesOfMethod obj = new TypesOfMethod();
		obj.m1();
		TypesOfMethod.m2();
	}
}
