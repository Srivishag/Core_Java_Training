package com.celcom.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(3, 2); // Min size and Increment Factor

		System.out.println(vector.size());
		System.out.println(vector.capacity() + "\n");

		vector.add(10);
		vector.add(20);
		vector.add(30);

		System.out.println(vector.size());
		System.out.println(vector.capacity() + "\n");

		vector.add(40);

		System.out.println(vector.size());
		System.out.println(vector.capacity());

		// Way 1 for Iterating the list

		for (int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}

		System.out.println();

		// Way 2 for Iterating the list

		for (Integer i : vector) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Way 3 for Iterating the list

		Enumeration<Integer> enu = vector.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + " ");
		}
	}
}
