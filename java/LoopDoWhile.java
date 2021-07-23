package com.ust.examples;
/*
 * 
 * for do while loop
 */

public class LoopDoWhile {
	public static void main(String[] args) {
		
		String[] str= {"akhila","alona","arya","sharmada","anjali"};
		int i = 0;
		do{
			
			if(str[i].equals("sharmada"))
				break;
				
			System.out.println(str[i]);
			i++;
		}
		while(i<str.length);
	}
}
