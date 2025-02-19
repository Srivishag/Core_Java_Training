package com.celcom.day11;

import java.util.ArrayList;
import java.util.Scanner;

public class BankRobbery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=in.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr.add(in.nextInt());
		}
		System.out.println("Enter the amount");
		int amount=in.nextInt();
		int first=0,last=0,sum=0,count=0;
		boolean flag=true;
		while(first!=size&&last!=size) {
			sum=0;
			ArrayList<Integer> solution = new ArrayList<>();
			for(int i=first;i<=last;i++) {
				sum+=arr.get(i);
			}
			if(sum>amount&&first<size) {
				first++;
			}
			else if(sum<amount&&last<size) {
				last++;
			}
			else {
				for(int i=first;i<=last;i++) {
					solution.add(arr.get(i));
					flag=false;
				}
				if(flag) {
					System.out.println("Suspicious Transaction amount:");
				}
				System.out.println(solution);
				count++;
				first++;
			}
		}
	}
}
