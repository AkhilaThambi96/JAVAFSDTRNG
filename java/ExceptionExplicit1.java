package com.ust.examples;

public class ExceptionExplicit1 {

	public static void main(String[] args) {
	try {
		ExceptionExplicit1 e = new ExceptionExplicit1();
		System.out.println("length of JUNK is" +  e.getStringSize("JUNK"));
		System.out.println("length of WRONG is"+e.getStringSize("WRONG"));
		System.out.println("length of null string is"+e.getStringSize(null));
	}
	catch(Exception ex) {
		System.out.println("Exception message:"+ex.getMessage());
	}

	}
public int getStringSize(String str) throws Exception
{
	if(str ==null) {
		throw new Exception("String input is null");
		
	}
	return str.length();
}
}
