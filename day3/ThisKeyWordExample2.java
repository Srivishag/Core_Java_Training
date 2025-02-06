package com.celcom.day3;

public class ThisKeyWordExample2 {
	String name;
	
	ThisKeyWordExample2(){
		this("helen");
		System.out.println("A");
	}
	
	ThisKeyWordExample2(String name){
		this(2);
		System.out.println("B");

	}
	ThisKeyWordExample2(int a){
		System.out.println("C");
	}

	public static void main(String[] args) {
		new ThisKeyWordExample2();
	}
}
