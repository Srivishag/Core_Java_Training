package com.celcom.day1;

public class CommandLineArgumentExampleTwo{
	public static void main(String[] args){
		if(args.length == 2){
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("Addition : " + (num1+num2));
		}
		else{
			System.out.println("Expecting only 2 numbers as command line input");
		}
	}
}