package com.ust.examples;
/*
 * 
 * 
 */
//calculation is a super class
 class calculation {
	 int z;
	 public void Addition(int x, int y ) {
		 z = x + y;
		 System.out.println("the sum of given numbers:"+ z);
	 }
	 public void Substraction(int x, int y ) {
		 z = x - y;
		 System.out.println("the difference between the given numbers:"+ z);
	 }
 }
 //Example36 is a subclass
 public class Example36 extends calculation{
	 public void Multiplication(int x, int y ) {
		 z = x * y;
		 System.out.println("the product of the given numbers:"+ z);
	 }
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Example36 e = new Example36();
		e.Addition(a,b);
		e.Substraction(a,b);
		e.Multiplication(a, b);

		

	}

}
