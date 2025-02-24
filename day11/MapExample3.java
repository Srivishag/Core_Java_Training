package com.celcom.day11;

import java.util.Map;
import java.util.TreeMap;

public class MapExample3 {
	public static void main(String[] args) {
		Map<Integer,String> treemap= new TreeMap<>();
		treemap.put(1,"Srivishag");
		treemap.put(2,"Kumar");
		treemap.put(3,"Ajith");
		System.out.println(treemap);
		System.out.println(treemap.containsKey(1));
		System.out.println(treemap.containsValue("Srivishag"));
		Map<Integer,String> treemap2= new TreeMap<>();
		try {
			treemap2.put(null, null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		treemap2.put(1,"Srivishag");
		treemap2.put(2,"Kumar");
		treemap2.put(3,"Ajith");
		treemap2.put(3,null);
		treemap2.put(4, null);
		System.out.println(treemap.equals(treemap2));
		System.out.println(treemap.get(1));
		System.out.println(treemap.keySet());
		treemap.putAll(treemap2);
		System.out.println(treemap);
		
	}
}
