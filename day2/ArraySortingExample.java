package com.celcom.day2;

import java.util.Arrays;

public class ArraySortingExample {
	public static void main(String[] args) {
		int arr[]= {2,6,4,5,7,3,8};
		Arrays.sort(arr);
		
		//Ascending Order
		for(int index=0; index<arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
		System.out.println("Minimum Value : " + arr[0]);
		System.out.println("Second Minimum Value : " + arr[1]);
		System.out.println("Maximum Value : " + arr[arr.length-1]);
		System.out.println("Second Maximum Value : " + arr[arr.length-2]);
		
		//Descending Order
		for(int index=arr.length-1; index>=0; index--) {
			System.out.print(arr[index] + " ");
		}
	}
	

}
