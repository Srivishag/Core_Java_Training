package com.celcom.saturday_assignment_15_feb_2025;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to iterate through all elements in a linked list.

public class Assignment6 {
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

		System.out.print("The Elements of the linkedlist are : ");
		Iterator<Integer> it = linkedlist.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		in.close();
	}
}
