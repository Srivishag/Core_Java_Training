package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to print all the elements of an ArrayList using the elements' position.

public class Assignment5 {
	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the arraylist");
		int length = in.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < length; i++) {
			System.out.print("Element " + (i + 1) + " :");
			arraylist.add(in.nextInt());
		}
		
		System.out.println("The Elements of the array are : ");
		for(int i=0;i<length;i++) {
			System.out.println("Element "+ (i+1) +" :"+arraylist.get(i));
		}
		in.close();
	}
}
