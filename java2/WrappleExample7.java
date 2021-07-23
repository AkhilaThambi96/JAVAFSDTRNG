package com.ust.examples;

import java.util.TreeSet;
import java.util.Iterator;

public class WrappleExample7 {

	public static void main(String[] args) {
		TreeSet<String>ts = new TreeSet<String>();
		ts.add("Greeks");
		ts.add("For");
		ts.add("Geeks");
		ts.add("is");
		ts.add("Very Helpful");
		
		Iterator<String>itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
