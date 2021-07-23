package com.ust.examples;


import java.io.File;
import java.io.IOException;
/*
 * 
 *file operations 
 * 
 */
public class FileHandling {

	public static void main(String[] args) throws IOException {
		File f = new File("c:\\users\\ustjava20\\Sample.txt");
		if(f.createNewFile()) {
			
			System.out.println("new file is created");
		}else {
			System.out.println("file already exists");
		}

	}

}
