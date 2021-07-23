package com.ust.examples;
/*
 * single inheritance
 */

 class one {
	 public void print_geek()
	 {
		 
	System.out.println("greeks");
	 }
 }
 class two  extends one{
	 public void print_for() {
		 System.out.println("for");
	 }
 }
public class Example33{
	public static void main(String[] args) {
		
		two t = new two();
		
		
		t.print_geek();
	     t.print_for();

	}

}
