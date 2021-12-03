package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		String path = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			file.delete();
			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
	}

}
