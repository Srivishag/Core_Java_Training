package com.celcom.day4;

public class MethodOverloadingExample2 {
	void addition(int num1,int num2) {
		System.out.println("Integer Addition : "+ (num1+num2));
	}
	void addition(double num1,double num2) {
		System.out.println("Double Addition : "+ (num1+num2));
	}
	void addition(long num1,long num2) {
		System.out.println("Long Addition : "+ (num1+num2));
	}
	void addition(long num1,double num2) {
		System.out.println("Long and Double Addition : "+ (num1+num2));
	}
	public static void main(String[] args) {
		MethodOverloadingExample2 obj=new MethodOverloadingExample2();
		obj.addition(1,3);
		obj.addition(1.0,3.0);
		obj.addition(1L,3L);
		obj.addition(1L,3.0);
	}
}
