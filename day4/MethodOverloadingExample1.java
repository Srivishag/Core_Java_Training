package com.celcom.day4;

public class MethodOverloadingExample1 {
	
	void myMethod(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		System.out.println("Factorial of given number is : " + fact);
	}
	
	int myMethod(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("Addition of given numbers are : " + sum);
		return sum;
	}
	
	void myMethod(String name) {
		System.out.println("Welcome "+ name);
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample1 obj=new MethodOverloadingExample1();
		obj.myMethod(10,20);
		obj.myMethod(10);
		obj.myMethod("Dani");
		
		
	}

}
