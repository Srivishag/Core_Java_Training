package com.celcom.day4;

class SuperClass{
	int a=10;
	void myMethod() {
		System.out.println("I am from Super Class");
	}
}

class SubClass extends SuperClass{
	char a='1';
	void myMethod() {
		System.out.println("I am from Sub Class");
	}
}

public class MethodOverridingExample1 {
	public static void main(String[] args) {
		SubClass obj1=new SubClass();
		obj1.myMethod();
		System.out.println(obj1.a);

		SuperClass obj=new SubClass();
		obj.myMethod();
		System.out.println(obj.a);
	}
}
