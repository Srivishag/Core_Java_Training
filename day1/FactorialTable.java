package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int factorial=1;
		for(int i=0;i<=num;i++) {
				factorial*=i;
				if(i==0) {
					factorial=1;
				}
				System.out.println("Factorial of "+i+" is "+(factorial));
		}
		sc.close();
	}
}
