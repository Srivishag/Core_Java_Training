package com.celcom.day11;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "Srivishag");
		hashMap.put(2, "Kumar");
		hashMap.put(3, "Raj");
		System.out.println(hashMap);
		
		for(Map.Entry<Integer,String> entryset : hashMap.entrySet()) {
			System.out.println(entryset.getKey()+":"+entryset.getValue());
		}
		
		hashMap.forEach((id,name)->{
			System.out.println(id+":"+name);
		});
		
		Map<Integer,String> hashMap2 = new HashMap<>();
		hashMap2.put(1, "Kjaja");
		hashMap2.put(2, "Kuhshsmar");
		hashMap2.put(3, "HSHSHS");
		hashMap2.putAll(hashMap);
		System.out.println(hashMap.hashCode());
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap2.remove(2));
		System.out.println(hashMap2);
		
		
		
		hashMap2.merge(1,"diary",(oldValue,newValue)->oldValue+newValue);
		hashMap2.putIfAbsent(4, null);
		System.out.println(hashMap2);
		
		System.out.println(hashMap2.containsKey(1));
		System.out.println(hashMap2.containsValue("Srivishagdiary"));

	}
}
