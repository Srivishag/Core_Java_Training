package com.celcom.day9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(10);
		System.out.println(list);

		System.out.println(list.get(0));
		list.add(1, 15);
		System.out.println(list);

		list.set(1, 20);
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		list.remove(new Integer(10));
		System.out.println(list);

		System.out.println(list.size());
		System.out.println(list.contains(10));
		System.out.println(list.isEmpty());

		// Way 1 for Iterating the list

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		// Way 2 for Iterating the list

		for (Integer i : list) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Way 3 for Iterating the list

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
