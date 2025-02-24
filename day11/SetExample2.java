package com.celcom.day11;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		tree.add("Shervin");
		tree.add("Srivishag");
		tree.add("Kumar");
		System.out.println(tree);
		try {
			tree.add(null);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		for(String str:tree) {
			System.out.println(str);
		}
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(null);
		linkedHashSet.add("kumar");
		linkedHashSet.add("Ajith");
		linkedHashSet.add("Dhanuss");
		System.out.println(linkedHashSet);
		System.out.println(linkedHashSet.add("Kumar"));
		System.out.println(tree.contains("Shervin"));
		try {
			System.out.println(tree.containsAll(linkedHashSet));
		}
		catch(Exception e) {
			System.out.println("Tree cannot search"+e);
		}
		System.out.println(tree.hashCode());
		System.out.println(tree.isEmpty());
		System.out.println(tree.remove("Surya"));
		System.out.println(tree.removeAll(linkedHashSet));
		
	}
}
