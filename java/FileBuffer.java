package com.ust.examples;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBuffer {

	public static void main(String[] args) {
		File file = new File("FileExample.txt");
		//writing file using BufferedWriter
		
		FileWriter filewriter = null;
		BufferedWriter bufferedwriter = null;
		try {
			filewriter =new FileWriter(file);
			bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write("This is an example \n");
			bufferedwriter.write("BufferedReader");
			bufferedwriter.flush();
			
		}
         catch(IOException e)
		{
        	 e.printStackTrace();
		}
		finally {
			try {
				if(filewriter!=null)
				{
					filewriter.close();
				}
				if(bufferedwriter!=null)
				{
					bufferedwriter.close();
				}
				
			}
			catch(Exception e) {
		    	 e.getStackTrace();
		     }	
		}
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try {
			fileReader =new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			
			while((line=bufferedReader.readLine())!=null) {
				System.out.print(line);
		}
		}
         catch(IOException e)
		{
        	 e.printStackTrace();
		}
		finally {
			try {
				if(fileReader!=null)
				{
					fileReader.close();
				}
				
				if(bufferedReader!=null)
				{
					bufferedReader.close();
				}
				
			}
			catch(IOException e)
			{
	        	 e.printStackTrace();
			}
		}
		

	}

}
