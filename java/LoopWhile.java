package com.ust.examples;
/*
 * 
 * for while loop
 */

public class LoopWhile {

	public static void main(String[] args) {
		String[] str= {"akhila","alona","arya","sharmada","anjali"};
		int i=0;
		while(i<str.length){
			
			
			if(str[i].equals("sharmada"))
				//break;
				continue;
			System.out.println(str[i]);
			i++;
			
		}

	}

}
