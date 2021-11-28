package com.brainmentors.java.stringhandling;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Literal Style
		String name = "Ram"; // 1 or 0
		String name2 = "Ram";
		
		//String Object Style
		String name3 = new String("Ram");
		//String name3 = new String("Ram").intern(); // 1 or 2
		String name4 = new String("Ram");
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name3 == name4);
		
		String t = "Hello";
		String y = t;
		
		System.out.println(y == t);
		
		t = t + "How are you";
		
		System.out.println(y == t);

	}

}
