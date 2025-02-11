package com.celcom.day6;

public class GarbageCollectionExample {
	static int count=0;
	GarbageCollectionExample(){
		count++;
		System.out.println(count);
	}
	
	protected void finalize() {
		count--;
		System.out.println(count);
	}
	public static void main(String[] args) {
		GarbageCollectionExample obj1=new GarbageCollectionExample();
		GarbageCollectionExample obj2=new GarbageCollectionExample();
		GarbageCollectionExample obj3=new GarbageCollectionExample();
		obj3=null;
		GarbageCollectionExample obj4=new GarbageCollectionExample();

		obj1=null;
		Runtime.getRuntime().gc();
		obj2=null;
		System.gc();
		
		System.gc();



	}
}
