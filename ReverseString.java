package com.brainmentors.java.stringhandling;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String input = "Java Example";
		
		
		char[] input1 = input.toCharArray();
		
		for(int i = input1.length-1; i >= 0; i--)
		{
			System.out.print(input1[i]);
		}
		
		
//		StringBuilder input1 = new StringBuilder();
//		
//		input1.append(input);
//		
//		input1.reverse();
//		
//		System.out.println(input1);
	}
}
