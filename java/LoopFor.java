package com.ust.examples;
/*
 * example of for loop
 * 
 * 
 */

public class LoopFor {

	public static void main(String[] args) {
		//String[] str =new string[5];
		String[] str= {"akhila","alona","arya","sharmada","anjali"};
		for(int i=0;i<str.length;i++){
			
			if(str[i].equals("sharmada"))
				//break;
				continue;
			System.out.println(str[i]);
			
		}

	}

}
