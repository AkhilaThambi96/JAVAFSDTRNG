package com.ust.examples;
/*
 * final variable,final metho,final class
 */

public class Example43 {
	int a;
	final int b;
    Example43(){
    	a=7;
    	b = 5;
    }
	public static void main(String[] args) {
	final int x;
	x = 10;
	System.out.println(x);
	Example43 e = new Example43();
	System.out.println(e.a);
	System.out.println(e.b);
	e.a = 3;
	System.out.println(e.a);
	

	}

}
