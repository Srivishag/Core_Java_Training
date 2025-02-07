package com.celcom.day4;
import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Pronic Number");
		int num=in.nextInt();
		in.close();
		if(num%2!=0) {
			System.out.println("Not A Pronic Number");
			return;
		}
		else {
			for(int i=1;i<Math.sqrt(num);i++) {
				if(((i)*(i+1))==num) {
					System.out.println("It is a Pronic Number");
					return;
				}
			}
		}
		System.out.println("Not a Pronic Number");
	}

}
