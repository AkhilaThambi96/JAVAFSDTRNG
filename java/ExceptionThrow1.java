package com.ust.examples;
import java.io.*;

class Exception1{
   void method(int num)throws IOException,ClassNotFoundException {
	   if(num ==1)
		   throw new IOException("IOException Occured");
	   else
		  throw new ClassNotFoundException("ClassNotFoundException"); 
   }
}
public class ExceptionThrow1 {
	public static void main(String[] args) {
	try {
		Exception1 e = new Exception1();
		e.method(1);
	}
	catch(Exception ex)
	{
		System.out.println(ex);	
		}

	}

}
