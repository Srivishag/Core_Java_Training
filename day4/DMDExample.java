package com.celcom.day4;

class Animals{
	int a=getNum();
	int getNum() {
		return 2;
	}
	
	{System.out.println("Animals");}
}
class Cats extends Animals{
	int b=getNum();
	int getNum() {
		return 3;
	}
	{System.out.println("Cats");}

	
}

public class DMDExample {
	public static void main(String[] args) {
		Animals obj=new Cats();
		System.out.println(obj.a);
	}

}
