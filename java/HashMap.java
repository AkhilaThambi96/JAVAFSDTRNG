package com.ust.examples;

import java.util.LinkedHashMap;

public class HashMap {

	public static void main(String[] args) {
		//initialise linked hashmap using generics
		
LinkedHashMap<Integer,String>hm1 = new LinkedHashMap<Integer,String>();
hm1.put(3,"geeks");

hm1.put(2,"for");
hm1.put(1,"geek");
System.out.println("Mappings of linkedhashmap:"+hm1);
	}

}
