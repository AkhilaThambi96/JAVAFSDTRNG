package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Wrapper3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>x = new ArrayList<Integer>();
		x.add(2);
		x.add(8);
		x.add(6);
		x.add(7);
		Collections.sort(x);
		System.out.println(x);
		
		if(x.contains(2)) {
			System.out.println("contain 2 in:"+x);
			System.out.println("index of 2 is:");
			System.out.println(x.indexOf(2));
		}else {
			System.out.println("not found");
		}
x.set(x.indexOf(2), 3);
System.out.println("replaced 2 with 6:");
System.out.println(x);
	}

}
