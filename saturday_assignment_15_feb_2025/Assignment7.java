package com.celcom.saturday_assignment_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//Write a Java program to iterate through all elements in a linked list starting at the specified position.

public class Assignment7 {
	public static void main(String[] args) {
		List<Integer> linkedlist = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the linkedlist");
		int length = in.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < length; i++) {
			System.out.print("Element " + (i + 1) + " :");
			linkedlist.add(in.nextInt());
		}
		
		System.out.println("Enter the position to start the iteration");
		int position = in.nextInt();
		if(position>length||position<1) {
			System.out.println("Invalid Position");
			in.close();
			return;
		}
		
		ListIterator<Integer> iterate = linkedlist.listIterator(position-1);
		for (int i=position;iterate.hasNext();i++) {
			System.out.println("Element " + (i) + " :" + iterate.next());
		}
		in.close();
	}
}
