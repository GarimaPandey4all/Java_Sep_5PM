package com.brainmentors.java.oops;

public class FinalizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeMethod obj = new FinalizeMethod();
		
		obj = null;
		
		System.gc();
		System.out.println("Main Completes");

	}
	
	public void finalize()
	{
		System.out.println("Finalize Method Overriden");
	}

}
