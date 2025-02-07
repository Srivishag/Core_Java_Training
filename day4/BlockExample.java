package com.celcom.day4;

class NonRelatedClass{
	{
		System.out.println("Non Related Class Block");
	}
}
public class BlockExample extends NonRelatedClass{
	
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	BlockExample(){
		System.out.println("Constructor Block");
	}
	
	@Override
	public String toString() {
		System.out.println("To String block");
		return "";
	}
	
	public static void main(String[] args) {
		BlockExample obj=new BlockExample();
		System.out.println(obj);
	}
}
