package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {
	
	public static void main(String[] args) throws IOException {
		
		String path = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\BasicPrograms\\src\\com\\brainmentors\\java\\filehandling\\FileReadDemo.java";
		
		File file = new File(path);
		final int EOF = -1;
		
		if(file.exists())
		{
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read();
			
			while(singleByte != EOF)
			{
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			
			fs.close();
		}
		
	}

}
