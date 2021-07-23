package com.ust.examples;

public class ExceptionArithmetic {

	public static void main(String[] args) {
		try {
			//code that generate exception
			int divideByZero = 5/0;	
		}
catch(ArithmeticException e)
		{
	System.out.println("ArithmeticException =>"+e.getMessage());
		}
		finally {
			System.out.println("This is the finally block");
		}
	}

}
