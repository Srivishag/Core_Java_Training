package com.celcom.day8;

public class StringMethodExample2 {
	public static void main(String[] args) {
		String s1 = "Java";

		System.out.println("Traversing Using CharAt and forloop");
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("\nTraversing using foreach and chararray");
		char ch[] = s1.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		
		System.out.println("\nSpliting the string to array");
		String s2 ="Welcome to Java Program";
		String temp[]=s2.split(" ");
		for(String s: temp) {
			System.out.println(s);
		}
	}
}
