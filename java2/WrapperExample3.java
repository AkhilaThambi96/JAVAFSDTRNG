package com.ust.examples;
import java.util.*;


public class WrapperExample3 {

	public static void main(String[] args) {
		List list =Arrays.asList("one two Three four five  six one three four".split(" "));
		System.out.println("List"+list);
		
		List sublist = Arrays.asList("three four".split(" "));
		System.out.println("SubList"+sublist);
		System.out.println("indexOfSubList :"+Collections.indexOfSubList(list,sublist));
		
		
		System.out.println("lastIndexOfSubList :"+Collections.lastIndexOfSubList(list,sublist));

	}

}
