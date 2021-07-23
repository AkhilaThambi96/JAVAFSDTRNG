package com.ust.examples;
import java.io.File;

public class FileFolder {

	public static void main(String[] args) {
		//create a file object
File f = new File("C:\\");
String[] fileList = f.list();
for(String str:fileList) {
	System.out.println(str);
}

	}

}
