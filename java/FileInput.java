package com.ust.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInput {

	public static void main(String[] args) {
		try {
			/*FileInputStream input = new FileInputStream("D:File1.txt");
			System.out.println("Data in the file:");
			
			int i =input.read();
			
			while(i != -1) {
				System.out.print((char)i);
				i = input.read();
			}
			input.close();*/
			String s = "output file";
			FileOutputStream output = new FileOutputStream("D:File1.txt");
			
			output.write(s.getBytes());
			output.close();
		}
     catch(Exception e) {
    	 e.getStackTrace();
     }
	}

}
