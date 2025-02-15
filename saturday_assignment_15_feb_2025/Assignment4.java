package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to reverse elements in an array list.

public class Assignment4 {
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
		
		for(int i=0,j=length-1;i<j;i++,j--) {
			int temp=arraylist.get(i);
			arraylist.set(i,arraylist.get(j));
			arraylist.set(j,temp);
		}
		
		System.out.print("The Elements of the array after reversal are : ");
		for(int num:arraylist) {
			System.out.print(num +" ");
		}
		in.close();
		
	}
}
