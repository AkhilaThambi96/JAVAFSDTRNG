package com.ust.examples;
import java.util.Enumeration;
import java.util.Hashtable;

public class Enum {

	public static void main(String[] args) {
		
Enumeration names;
String  key;
Hashtable<String,String> hashtable = new Hashtable<String,String>();
hashtable.put("key1","akhila");
hashtable.put("key2","sarmada");
hashtable.put("key3","alona");
hashtable.put("key4","arya");

  names = hashtable.keys();
  while(names.hasMoreElements())
  {
	  key=(String)names.nextElement();
	  System.out.println("key "+key+" "+"& value"+" "+hashtable.get(key));
  }
  
  
	}

}
