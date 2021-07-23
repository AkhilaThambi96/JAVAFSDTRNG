package com.ust.examples;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
 * wrapper class example
 */

public class Wrapper2 {

	public static void main(String[] args) {
		
		String num = "10";
		int num1 = 20;
		int sum = Integer.parseInt(num)+num1;
		System.out.println(sum);

		int i =5;
		Integer j = new Integer(5);//boxing
		Integer h = i; //autoboxing
		
		int o = h.intValue(); // unboxing
		
		ArrayList values = new ArrayList();
		values.add(5);
		values.add("name");
		System.out.println(values);		
		

	}

}
