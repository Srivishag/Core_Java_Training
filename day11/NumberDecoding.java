package com.celcom.day11;

import java.util.Scanner;

public class NumberDecoding {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();
		int total = 0;
		if (code.charAt(0) == '0') {
			System.out.println("Not Possible");
			return;
		}
		int[] arr = new int[code.length()+1];
		arr[0]=1;
		arr[1]=1;
		for (int i = 1; i < code.length(); i++) {
			int num = Integer.valueOf(code.substring(i-1,i+1));
			
			if(num<=26 && num%10!=0 && num/10!=0)
			{
				
				arr[i+1]=arr[i]+arr[i-1];
			}
			else if(num>26 && num%10==0)
			{
				System.out.println("Not Possible");
				return;
			}
			else
			{
				arr[i+1]=arr[i];
			}
		}
		System.out.println("Total Ways = " + arr[code.length()]);
	}

}