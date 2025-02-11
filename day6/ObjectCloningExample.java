package com.celcom.day6;

public class ObjectCloningExample implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloningExample obj1 = new ObjectCloningExample();
		System.out.println("Object 1 Hashcode " + obj1.hashCode());
		ObjectCloningExample obj2 =  (ObjectCloningExample) obj1.clone();
		System.out.println("Object 2 Cloned from Object 1 " + obj2.hashCode());
		
	}

}
