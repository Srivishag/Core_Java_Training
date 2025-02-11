package com.celcom.day6;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	int age;
	InvalidAgeException(int age){
		this.age=age;
	}
	public String toString() {
		return age+" this is an Invalid Age to Vote";
	}
}
public class UserDefinedExceptionExample {
	public static void main(String[] args) {
		System.out.println("Enter your age");
		int age=new Scanner(System.in).nextInt();
		if(age<18) {
			try {
				throw new InvalidAgeException(age);
			}
			catch(InvalidAgeException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("You are allowed to vote");
		}
	}
}
