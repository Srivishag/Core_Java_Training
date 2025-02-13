package com.celcom.day8;

public class StringBuilderAndBufferExample {
	public static void main(String[] args) {
		String s1="Java";
		s1.concat(" World");
		System.out.println(s1);
		
		s1=s1.concat(" World");
		System.out.println(s1);
		
		StringBuffer sb=new StringBuffer("Java");
		sb.append(" World lkjhgfiuytreytreUniverse");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		StringBuilder sbu=new StringBuilder("Java");
		sbu.append(" World");
		System.out.println(sbu.capacity());
		System.out.println(sbu);
	}
}
