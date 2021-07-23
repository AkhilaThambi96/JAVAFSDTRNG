package com.ust.examples;
import java.util.Scanner;

public class Vowels {
 
	
	public static void main(String[] args) 
	{
		String s;
		char ch;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		s = sc.nextLine();
		System.out.println("vowels in a string are");
	
		for(int j = 0;j<s.length();j++);
		{
			ch = s.charAt(i);
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':i = 1;
			System.out.println(ch);
				
			}
		}
			
	if(i == 0)
		System.out.println("there are no vowels in a string");
		

	}

}
