package com.celcom.day4;

public class MethodOverloadingExample3 {
	void concat(int num1,int num2) {
		System.out.println("Concatination of Two Integer : "+num1+num2);
	}
	void concat(String str1,String str2) {
		System.out.println("Concatination of Two String : "+str1+str2);

	}
	void concat(double num1,double num2) {
		System.out.println("Concatination of Two Double : "+num1+num2);
	}
	public static void main(String[] args) {
		MethodOverloadingExample3 obj=new MethodOverloadingExample3();
		obj.concat(1, 2);
		obj.concat(1.0, 2.0);
		obj.concat("1", "2");
	}
}
