package com.celcom.day6;

public class ObjectAssigningExample {
	public static void main(String[] args) {
		ObjectAssigningExample obj1 = new ObjectAssigningExample();
		System.out.println("Object 1 Hashcode " + obj1.hashCode());
		ObjectAssigningExample obj2 = obj1;
		System.out.println("Object 2 Hashcode assigned by Object 1 " + obj2.hashCode());
		
	}
}
