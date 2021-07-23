package com.ust.examples;
import java.util.*;

public class WrappleExample6 {

	public static void main(String[] args) {
		HashSet<String>hs = new HashSet<String>();
		hs.add("Greeks");
		hs.add("For");
		hs.add("Geeks");
		hs.add("is");
		hs.add("Very Helpful");
		
		Iterator<String>itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
