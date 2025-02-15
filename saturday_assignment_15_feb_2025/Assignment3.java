package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to copy one array list into another.


class CopyOneArrayToAnother{
	List<Integer> arraylist;
	public CopyOneArrayToAnother(List<Integer> arraylist) {
		this.arraylist=arraylist;
	}
	List<Integer> copyArrayList(int length) {
		List<Integer> copy = new ArrayList<>();
		for(int i=0;i<length;i++) {
			copy.add(arraylist.get(i));
		}
		return copy;
	}
	
	
}
public class Assignment3 {
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
		
		CopyOneArrayToAnother obj = new CopyOneArrayToAnother(arraylist);
		List<Integer> copy= obj.copyArrayList(length);
		System.out.print("The Elements of the Copy array are : ");
		for(int num:copy) {
			System.out.print(num +" ");
		}
		in.close();
		
	}
}
