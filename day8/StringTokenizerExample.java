package com.celcom.day8;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String s1 = "Welcome to Java Programing";
		StringTokenizer str = new StringTokenizer(s1," ");
		System.out.println(str.countTokens());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		
	}
	
}
