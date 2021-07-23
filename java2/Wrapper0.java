package com.ust.examples;

public class Wrapper0 {

	public static void main(String[] args) {
	int i =5;
	Integer obj = new Integer(i);//wrapping
	int j = obj.intValue();//unwrapping
	System.out.println(j);
	
	double d=5.5;
	Double obj1 = new Double (d);//wrapping
	Double dd = obj1.doubleValue();//unwrapping
	System.out.println(dd);
	}

}
