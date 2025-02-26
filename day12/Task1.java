package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenericsList1<T> {
	public List<T> mergeArrayList(List<T> arrayList1, List<T> arrayList2) {
		List<T> finalArrayList = new ArrayList<>();
		for (int i = 0; i < arrayList1.size() || i < arrayList2.size(); i++) {
			if (i < arrayList1.size()) {
				finalArrayList.add(arrayList1.get(i));
			}
			if (i < arrayList2.size()) {
				finalArrayList.add(arrayList2.get(i));
			}

		}
		return finalArrayList;
	}
}

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> arrayList1 = new ArrayList<>();
		List<Integer> arrayList2 = new ArrayList<>();
		
		System.out.println("Enter the size of first Array");
		int n1 = in.nextInt();
		
		System.out.println("Enter the elements");
		for (int i = 0; i < n1; i++) {
			arrayList1.add(in.nextInt());
		}
		
		System.out.println("Enter the size of second Array");
		int n2 = in.nextInt();
		
		System.out.println("Enter the elements");
		for (int i = 0; i < n2; i++) {
			arrayList2.add(in.nextInt());
		}

		GenericsList1<Integer> obj = new GenericsList1<>();
		List<Integer> finalArrayList = obj.mergeArrayList(arrayList1, arrayList2);
		
		System.out.println("Final ArrayList");
		for (int i = 0; i < finalArrayList.size(); i++) {
			System.out.print(finalArrayList.get(i) + " ");
		}
		in.close();

	}
}
