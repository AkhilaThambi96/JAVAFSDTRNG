package com.ust.examples;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample1 {

	public static void main(String[] args) {
		try {
		//FileWriter fName = new FileWriter("D:FileExample.txt");
			//fName.write("i am waiting to the file");
		//	fName.close();
			File fName = new File("D:FileExample.txt");
if(fName.createNewFile()) {
	System.out.println("file is created");
}else {
	System.out.println("already exist");
}

	
		System.out.println(fName.canRead());
		System.out.println(fName.canWrite());
		System.err.println("error occured");
		Scanner s = new Scanner(System.in);
				String txt =s.nextLine();
				System.out.println(txt);
				
				
		fName.setReadable(false);
		fName.setWritable(false);
		fName.setWritable(false, false);
		}
		catch(IOException e) {
	e.printStackTrace();
	
}
}
}