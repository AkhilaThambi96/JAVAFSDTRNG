package com.ust.examples;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		//create a file object
		File f = new File("D:File1.txt");
		//create a file
		try {
			f.createNewFile();
		}
		 catch(Exception e) {
	    	 e.getStackTrace();
	     }
		//Create an object contain new name
		File fNew = new File("D:FileNew.txt");
		boolean value = f.renameTo(fNew);
		if(value) {
			System.out.println("name of the file is changed.");
		}
		else {
			System.out.println("name canot be changed.");
		}
	}

}
