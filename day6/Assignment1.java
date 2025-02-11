package com.celcom.day6;

import java.util.Scanner;

class DuplicateElementException extends Exception {
	public String toString() {
		return "No Duplicate Elements are allowed";
	}
}

public class Assignment1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = in.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter " + size + " Values :");
		try {
			for (int i = 0; i < size; i++) {
				int num = in.nextInt();
				for (int j = 0; j < i; j++) {
					if (num == arr[j]) {
						throw new DuplicateElementException();
					}
				}
				arr[i] = num;
			}
			System.out.println("Success");
		} catch (DuplicateElementException e) {
			e.printStackTrace();
		}
	}
}
