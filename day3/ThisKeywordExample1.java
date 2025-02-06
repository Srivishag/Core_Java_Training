package com.celcom.day3;

public class ThisKeywordExample1 {
	String name;
	
	ThisKeywordExample1(){
		this("helen");
	}
	
	ThisKeywordExample1(String name){
		this.name=name;
		greeting();
	}
	void greeting() {
		System.out.println("Welcome " + name);
		
	}

	public static void main(String[] args) {
		new ThisKeyWordExample2();
	}
}
