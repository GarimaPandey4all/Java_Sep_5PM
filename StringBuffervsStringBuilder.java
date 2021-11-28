package com.brainmentors.java.stringhandling;

public class StringBuffervsStringBuilder {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		
		for(int i = 0; i < 10000; i++)
		{
			sb.append("Example");
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken by String Buffer: "+(endTime - startTime));
		
		startTime = System.currentTimeMillis();	
		StringBuilder sb2 = new StringBuilder("Java");
		
		for(int i = 0; i < 10000; i++)
		{
			sb2.append("Example");
		}
		
		endTime = System.currentTimeMillis();
		System.out.println("Time Taken by String Builder: "+(endTime - startTime));
		
		
		
		
	}
}
