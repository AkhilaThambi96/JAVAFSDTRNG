package com.ust.examples;
/*
 * upcasting and down casting
 */
public class Cast {

	public static void main(String[] args) {
		double num = 15.456;
		System.out.println(num);
		int n = (int)num;//downcasting the double to int type
		System.out.println(n);
		int x = 78;
		double y = x;
		System.out.println(x);
		System.out.println(y);
		//float f = 5.67f;
		float f = (float)5.67;
		byte d = (byte)f;
		System.out.println(d);
		
		long l = 675;
		float s = (float)l;
		System.out.println(s);
		
		int c = 4;
		String dbValue = String.valueOf(c);
		System.out.println(dbValue);
		
		dbValue = String.valueOf(l);
		System.out.println(dbValue);
		
		
	}

}
