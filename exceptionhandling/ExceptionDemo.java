package com.brainmentors.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		//Exception: Abnormal Condition which terminates the program flow
		
		System.out.println("DB Connection Open");
		System.out.println("DB Query");
		//try means guarded region
		try {
			
			String path = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File123\\abc.txt";
			//String path = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\abc.txt";
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
			}			
//			String name = null;
//			name.toUpperCase(); // throw NullPointerException
//			
//			int arr[] = new int[10];
//			arr[11] = 100; // throw ArrayIndexOutOfBoundsException
//			
//			System.out.println("Java Exception Handling Example");
//			int e = 10 / 0; // throw ArithmeticException
		}
		catch(IOException e)
		{
			System.out.println("File Can't be Created");
			return;
		}
		catch(ArithmeticException e)
		{
			System.out.println("You Divide a number with Zero "+e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More than Array Bound (Size)");
			System.exit(0);
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		}
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the Connection");
		
	}

}
