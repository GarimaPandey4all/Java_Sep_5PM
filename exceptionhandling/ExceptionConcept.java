package com.brainmentors.java.exceptionhandling;

public class ExceptionConcept {
	
	static void dao() throws ArithmeticException
	{
		System.out.println("Connection Open");
		try {
			int e = 100 / 0; // exception
			System.out.println("Query and Get Result");
			System.out.println("Send Result to Helper");
		}
		//finally is a block that always execute.
		finally {
			System.out.println("Connection Close");
		}
	}
	
	static void helper() throws ArithmeticException
	{
		System.out.println("Call DAO");
		dao();
		System.out.println("Get Result from DAO");
		System.out.println("Send Result to View");
		
	}
	
	static void view()
	{
		System.out.println("Call Helper");
		try
		{
			helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Some Problem in DAO...");
			e.printStackTrace();
			return;
		}
		System.out.println("Get Result from Helper");
		System.out.println("Print the Result to User");		
	}
	
	public static void main(String[] args) {
		
		view();
		
	}

}
