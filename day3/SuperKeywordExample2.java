package com.celcom.day3;

class A{
	A(){
		super();
		System.out.println("A");
	}
	A(int b){
		this();
		System.out.println("A Parameterized");
	}
}

class B extends A{
	B(){
		this(10);
		System.out.println("B");
	}
	B(int b){
		super(b);
		System.out.println("B Parameterized");
	}
}

public class SuperKeywordExample2 {
	public static void main(String[] args) {
		new B();
	}
}
