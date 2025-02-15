package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Write a Java program to sort a given array list.
public class Assignment2 {
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
		Collections.sort(arraylist);
		System.out.print("The Elements of the Sorted array are : ");
		for(int num:arraylist) {
			System.out.print(num +" ");
		}
		in.close();
	}
}
