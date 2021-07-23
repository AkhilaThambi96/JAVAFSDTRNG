package com.ust.examples;

public class ExceptionBank extends Exception{
	static String msg = "error";

	ExceptionBank(String message){
		super(message);
	}
	
	public static void main(String[] args) throws ExceptionBank {
		if(msg.equals("error")) {
			System.out.println("error message");
		}
		else
			throw new ExceptionBank("ExceptionBank");	

	}

}
