package com.celcom.day6;

import java.util.Scanner;

class VowelException extends Exception {
	public String toString() {
		return "No Vowel is found";
	}
}

public class Assignment2 {
	static boolean isVowel(String str) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		for (char c : str.toCharArray()) {
			for (int i = 0; i < vowels.length; i++) {
				if (Character.toLowerCase(c) == vowels[i]) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = in.next();
		try {
			if (!isVowel(str)) {
				throw new VowelException();
			} else {
				System.out.println("Valid String");
			}
		} catch (VowelException e) {
			e.printStackTrace();
		}
	}
}
