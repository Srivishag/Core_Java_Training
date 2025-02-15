package com.celcom.saturday_assignment_15_feb_2025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to search for an element in an array list.
class Search {
	static void finder(List<Integer> arraylist,int length,int find) {
		boolean flag = true;
		for (int i = 0; i < length; i++) {
			if (find == arraylist.get(i)) {
				if (flag) {
					System.out.print("The Element " + find + " is present in index " + i);
					flag = false;
				} else {
					System.out.print(" " + i);
				}

			}
		}
		if (flag) {
			System.out.println("Element " + find + " is not present in the ArrayList");
		}
	}
}

public class Assignment1 {
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
		System.out.println("Enter the element to be searched in the arraylist");
		int find = in.nextInt();
		Search.finder(arraylist,length,find);
		in.close();
	}
}
