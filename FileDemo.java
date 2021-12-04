package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".mp3");
	}
	
}

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		String path = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\sample2.txt");
			file.renameTo(file2);
			//file.delete();
			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		path = "E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\xyz\\abc\\xxx\\yyyy";
		
		file = new File(path);
		
		//file.mkdir();
		
		file.mkdirs();
		
		file = new File("E:\\Java\\JavaPrograms_Sep_Eclipse_5PM\\File\\songs");
		
		MyFilter filter = new MyFilter();
		
		//File files[] = file.listFiles(filter);
		
		File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
		File files2[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".mp4"));
		
		System.out.println("No of Files "+files.length);
		System.out.println("No of Files "+files2.length);
		
	}

}
