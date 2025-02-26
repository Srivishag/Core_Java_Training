package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GenericsList2<T>{
	boolean isEquals(List<T> arrayList1,List<T> arrayList2) {
		if(arrayList1.size()!=arrayList2.size()) {
			return false;
		}
		else {
			for(int i=0;i<arrayList1.size();i++) {
				if(!arrayList1.get(i).equals(arrayList2.get(i))) {
					return false;
				}
			}
		}
		return true;
		
	}
}

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> arrayList1=new ArrayList<>();
		List<Integer> arrayList2=new ArrayList<>();
		System.out.println("Enter the size of first Array");
		int n1=in.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n1;i++) {
			arrayList1.add(in.nextInt());
		}
		System.out.println("Enter the size of second Array");
		int n2=in.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n2;i++) {
			arrayList2.add(in.nextInt());
		}
		
		GenericsList2<Integer> obj= new GenericsList2<>();
		if(obj.isEquals(arrayList1, arrayList2)) {
			System.out.println("The ArrayLists are same");
		}
		else {
			System.out.println("The ArrayLists are different");
		}
		in.close();
	}
}
