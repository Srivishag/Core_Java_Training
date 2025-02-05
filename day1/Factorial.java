package com.celcom.day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int factorial=1;
		while(num>0) {
			factorial*=num;
			num--;
		}
		System.out.println("Factorial of given number is "+(factorial));
		sc.close();
	}
}
