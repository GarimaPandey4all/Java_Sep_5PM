package com.brainmentors.java.stringhandling;

public class StringBufferConcept {
	
	public static void main(String[] args) {
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("Hello");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("How are you, I'm fine jhgsfgIEFYGQIWEYGRFUYEIUIQWGLIUFGLUERGFQIUL");
		System.out.println(sb.capacity()+" "+sb.length());
		
		sb.append("brain mentors");
		System.out.println(sb.capacity()+" "+sb.length());
		
		
	}

}
