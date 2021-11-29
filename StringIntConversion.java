package com.brainmentors.java.stringhandling;

public class StringIntConversion {
	
	public static void main(String[] args) {
		
//		String str1 = "5";
//		int result = Integer.parseInt(str1);
//		
//		System.out.println(result);
//		
//		String str2 = "5";
//		
//		Integer result2 = Integer.valueOf(str2);
//		
//		System.out.println(result2);
		
		//int to String
		int x = 5;
		
		String str = Integer.toString(x);
		System.out.println(str);
		
		String str2 = String.valueOf(x);
		System.out.println(str2);
		
	}

}
