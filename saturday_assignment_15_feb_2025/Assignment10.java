package com.celcom.saturday_assignment_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Write a Java program to copy a linked list to another linked list.


class CopyOneListToAnother{
	List<Integer> arraylist;
	public CopyOneListToAnother(List<Integer> arraylist) {
		this.arraylist=arraylist;
	}
	List<Integer> copyLinkedList(int length) {
		List<Integer> copy = new LinkedList<>();
		for(int i=0;i<length;i++) {
			copy.add(arraylist.get(i));
		}
		return copy;
	}
	
}
public class Assignment10 {
	public static void main(String[] args) {
		List<Integer> arraylist = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the LinkedList");
		int length = in.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < length; i++) {
			System.out.print("Element " + (i + 1) + " :");
			arraylist.add(in.nextInt());
		}
		CopyOneListToAnother obj = new CopyOneListToAnother(arraylist);
		List<Integer> copy= obj.copyLinkedList(length);
		System.out.print("The Elements of the Copy Linked List are : ");
		for(int num:copy) {
			System.out.print(num +" ");
		}
		in.close();
		
	}
}
