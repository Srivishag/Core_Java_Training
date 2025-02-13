package com.celcom.day8;

public class StringMethodExample1 {
	public static void main(String[] args) {
		// String Methods
		String s1 = "Java";

		System.out.println(s1.length()); // to check length
		System.out.println(s1.charAt(1)); // to access character at particular index
		System.out.println(s1.toLowerCase()); // it convert the string to lower case and returns
		System.out.println(s1.toUpperCase()); // it convert the string to upper case and returns

		System.out.println(s1.concat(" World")); // adds new string and returns
		System.out.println(s1.replace('a', 'z')); // replace characters with replacement and returns

		System.out.println(s1.equals("java")); // check whether both string are same
		System.out.println(s1.equalsIgnoreCase("java")); // check whether both string are same ignoring case
		System.out.println(s1.contains("av")); // checks whether string contains input string
		System.out.println(s1.startsWith("Ja")); // checks whether it starts with this string
		System.out.println(s1.endsWith("va")); // checks whether it ends with this string

		String s2 = "Java World";
		System.out.println(s2.substring(0, 4)); // creates substring
		System.out.println(s2.substring(5, 10));
	}

}
