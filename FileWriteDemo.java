package com.brainmentors.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the Data to Write in a File:");
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\sample.txt");
		fo.write(txt.getBytes());
		
		fo.close();
		System.out.println("Data Write in a File");

	}
}
