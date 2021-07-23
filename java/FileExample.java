package com.ust.examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {
		try {
			
	//FileWriter f = new FileWriter("D:File1.txt");	
	File f = new File("D:File1.txt");
	/*	if(f.createNewFile()) {
			System.out.println(f.getName()+"is created");
	}
	else {
		System.out.println("already exist");

	}*/
//	f.write("this is java training");
	//Scanner read = new Scanner(f);
	FileReader read = new FileReader(f);
	/*while(read.hasNextLine()) {
		String data = read.nextLine();
		System.out.println(data);
	}*/
	int ch;
	while((ch =read.read())!=-1) {
		System.out.print((char)ch);
		
	}
	read.close();
	//f.close();
		}
	catch(IOException e) {
		System.out.println("exception occured");
	}
	}
}
