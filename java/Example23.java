package com.ust.examples;
/*
 * 
 * palindrome
 */

public class Example23 {

	public static void main(String[] args) {
		int r;
		int sum=0;
		int temp;
		int n = 456;
	 temp = n;
	 while(n>10) {
		 r = n%10;
		 sum = (sum*10)+r;
		 n=n/10;
	 }
if(temp != sum) { 
	System.out.println("palindrome");
}
else {
	System.out.println(" not palindrome");
}
	
	}
}
