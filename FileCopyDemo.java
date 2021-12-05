package com.brainmentors.java.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
	
	public static void main(String[] args) throws IOException {
		
		String sourcePath = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\songs\\song.mp3";
		String desPath = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\songs\\songCopy.mp3";
		
		File file = new File(sourcePath);
		
		final int EOF = -1;
		
		if(!file.exists())
		{
			System.out.println("Can't Copy File... Not Exist");
			return;
		}
		
		FileInputStream fs = new FileInputStream(file); // read
		BufferedInputStream bs = new BufferedInputStream(fs);
		FileOutputStream fo = new FileOutputStream(desPath); // write
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		//fo.write(fs.read());
		long startTime = System.currentTimeMillis();
		int singleByte = bs.read();
		
		while(singleByte != EOF)
		{
			bo.write(singleByte);
			singleByte = bs.read();
		}
		
		bo.close();
		bs.close();
		fo.close();
		fs.close();
		long endTime = System.currentTimeMillis();
		System.out.println("Data Copied "+(endTime - startTime)+"ms");
	}

}
