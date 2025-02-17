package com.celcom.day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n = in.nextInt();
		System.out.println("Enter the Elements :");
		for(int i=0;i<n;i++) {
			arraylist.add(in.nextInt());
		}
		List<Integer> linkedlist = new LinkedList<>(arraylist);
		System.out.println("Arraylist is converted to Linkedlist ...");
		System.out.println("The Values of Copied linked list are :");
		Iterator<Integer> it = linkedlist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		in.close();
	}
}
