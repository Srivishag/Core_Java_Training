package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		boolean status=true;
		do {
			System.out.println("Choose a Choice");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Addition of two number:"+(num1+num2));
				break;
			case 2:
				System.out.println("Subtraction of two number:"+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication of two number:"+(num1*num2));
				break;
			case 4:
				System.out.println("Division of two number:"+(num1/num2));
				break;
			
			}
			System.out.println("Do you want to continue Y/N");
			String decision=sc.next();
			if(decision.equals("N")) {
				status=false;
				System.out.println("Calculator Closed");
			}
			
		}while(status);
		sc.close();
	}
}
