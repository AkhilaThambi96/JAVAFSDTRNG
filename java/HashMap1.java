package com.ust.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		//initialise linked hashmap using generics
		
LinkedHashMap<Integer,String>hm = new LinkedHashMap<Integer,String>();
hm.put(3,"geeks");

hm.put(2,"for");
hm.put(1,"geek");
for(Entry<Integer, String> mapElement:hm.entrySet())
{
	Integer key = mapElement.getKey();
	String value = mapElement.getValue();
	

System.out.println(key+":"+value);
	}

}
	}
