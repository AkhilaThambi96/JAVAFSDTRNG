package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class Collection1 {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(2);
		arr.add(2.1f);
		arr.add("string hi");
		arr.remove(1);
		
		
		arr.add(2,"akhila");
		//System.out.println(arr);
		
		ArrayList<Integer>x =new ArrayList<Integer>();
		x.add(1);
		x.add(10);
		x.add(4);
		x.add(2);
		x.add(0);
		Collections.sort(x);
		System.out.println(x);
		
		/*int y=4;
		System.out.println(x);
		for(int i=0;i<x.size();i++)
		{
			if(x.get(i)==y)
			{
		System.out.println("exists");
		

	}

		}*/
		if(x.contains(1)) {
		System.out.println(x.indexOf(1));
			
		}
		x.set(x.indexOf(1),6);
		System.out.println(x);
}
	}
