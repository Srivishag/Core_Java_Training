package com.celcom.saturday_assignment_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to iterate a linked list in reverse order.


public class Assignment8 {
	public static void main(String[] args) {
		List<Integer> linkedlist = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the Linkedlist");
		int length = in.nextInt();
		
		System.out.println("Enter the Elements");
		for (int i = 0; i < length; i++) {
			System.out.print("Element " + (i + 1) + " :");
			linkedlist.add(in.nextInt());
		}
		
		for(int i=0,j=length-1;i<j;i++,j--) {
			int temp=linkedlist.get(i);
			linkedlist.set(i,linkedlist.get(j));
			linkedlist.set(j,temp);
		}
		System.out.print("The Elements of the linkedlist after reversal are : ");
		for(int num:linkedlist) {
			System.out.print(num +" ");
		}
		in.close();
	}
}
