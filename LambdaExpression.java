package com.brainmentors.java.oops;

interface Addable {
	public int add(int a, int b);
}

public class LambdaExpression {
//	Lambda Expression: It is used to define the interface abstract method
//	in a short form.
	
	public static void main(String[] args) {
		
		Addable ad = (a, b)->(a + b);
		System.out.println(ad.add(10, 20));
		
		Addable ad2 = (a, b)->(a + b);
		System.out.println(ad2.add(100, 200));
		
		
	}

}
