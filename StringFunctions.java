package com.brainmentors.java.stringhandling;

public class StringFunctions {

	public static void main(String[] args) {
		
		//String name = "	Amit Kumar	";
		String name = "Amit";
		// index number: 0 to 3
		// position number: 1 to 4
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1, 3)); // 1 - index number , 3 - position number
		System.out.println(name.trim());
		System.out.println(name.replace('i', 'a'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Kumar"));
		System.out.println(name+" Delhi");
		System.out.println(name.contains("Am"));
		System.out.println(name.indexOf("A"));
		System.out.println(name.lastIndexOf("t"));
		
	}
	
}
