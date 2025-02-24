package com.celcom.day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("Srivishag");
		set1.add("Shervin");
		set1.add("Karthi");
		set1.add("Shervin");
		System.out.println("Before merge : "+set1);

		Set<String> set2 = new HashSet<>();
		set2.add("Kumar");
		set2.add("Surya");
		set2.add("Jay");
		set1.addAll(set2);
		System.out.println("After merge : "+set1);
		
		System.out.println("Before Clear : "+set2);
		set2.clear();
		System.out.println("After Clear : "+set2);
		set2.addAll(set1);
		System.out.println(set1.contains("Shervin"));
		System.out.println(set1.containsAll(set2));
		System.out.println(set1.hashCode());
		System.out.println(set1.isEmpty());
		System.out.println(set1.remove("Surya"));
		System.out.println(set1.removeAll(set2));
		Set<String> tree = new TreeSet<>();
		tree.add("atree");
		tree.add("kumar");
		tree.add("raj");
		List<String> arr= new ArrayList<>();
		arr.add("king");
		set1.addAll(arr);
		set1.addAll(tree);		
		System.out.println(set1);
		System.out.println(tree);
		
		System.out.println("Retain all : "+set1.retainAll(tree));
		System.out.println(set1.size());
		System.out.println(set1.toString());
		for(String str:set1) {
			System.out.println(str);
		}
		Iterator<String> iterator = set1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Object[] array = set1.toArray();
		for(Object obj:array) {
			System.out.println(obj);
		}
		
	}

}
