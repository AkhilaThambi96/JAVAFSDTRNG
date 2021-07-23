package com.ust.examples;
/*
 * 
 * method overloading
 */
public class OverLoading {
	int x;//instance varibale
	int y;
	//create method 
	int calculate(int a,int b) {
		return a+b;
	}
	int calculate(int a,int b,int c) {
		return a+b+c;
	}
	float calculate(float a,float b) {
		return a+b;
	}
    String calculate(String a,String b) {
    	return a+b;
    }
	public static void main(String[] args) {
		//created  object
		OverLoading e = new OverLoading();
	int w = e.calculate(2, 40, 30);
	int m = e.calculate(5,6);
	float n = e.calculate(5.6f, 6.5f);
	String o = e.calculate("hello"," world");
	
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);
	System.out.println(w);

	}

}
