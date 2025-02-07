package com.celcom.day4;

public class ConstructorOverloadingExample1 {

	public ConstructorOverloadingExample1(int num1) {
		this(10.0,20.0);
		System.out.println("Just One Integer : "+num1);

	}
	public ConstructorOverloadingExample1(double num1,double num2) {
		this("Dani","Sherwin");
		System.out.println("Concatination of Two Double : "+num1+num2);

	}
	public ConstructorOverloadingExample1(String str1,String str2) {
		System.out.println("Concatination of Two String : "+str1+str2);

	}
	
	public static void main(String[] args) {
		new ConstructorOverloadingExample1(10,20);
		//new ConstructorOverloadingExample1(10.0,20.0);
		//new ConstructorOverloadingExample1("Dani","Shervin");

	}

}
