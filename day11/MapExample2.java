package com.celcom.day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample2 {
	public static void main(String[] args) {
		Map<Integer, String> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(1, "Srivishag");
		linkedhashmap.put(2, "Kumar");
		linkedhashmap.put(3, "Ajith");
		System.out.println(linkedhashmap);
		System.out.println(linkedhashmap.containsKey(1));
		System.out.println(linkedhashmap.containsValue("Srivishag"));
		Map<Integer, String> linkedhashmap2 = new LinkedHashMap<>();
		linkedhashmap2.put(1, "Srivishag");
		linkedhashmap2.put(2, "Kumar");
		linkedhashmap2.put(3, "Ajith");
		linkedhashmap2.put(null, null);
		linkedhashmap2.put(3, null);
		System.out.println(linkedhashmap.equals(linkedhashmap2));
		System.out.println(linkedhashmap.get(1));
		System.out.println(linkedhashmap.keySet());
		linkedhashmap2.putAll(linkedhashmap2);
		System.out.println(linkedhashmap2);

	}
}
