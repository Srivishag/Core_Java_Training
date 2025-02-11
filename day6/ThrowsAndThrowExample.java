package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsAndThrowExample {
	static void m1() throws FileNotFoundException {
		FileReader fr = new FileReader("Test.txt");

	}

	static void m2() {
		try {
			m1();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println("Error 1");
		m2();
		System.out.println("Error 2");

		throw new ArithmeticException();

	}
}
