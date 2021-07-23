package com.ust.examples;
import java.util.Scanner;


public class Reverse {

	public static void main(String[] args) {
		String Original,reverse = "";
		Scanner sct = new Scanner(System.in);
		System.out.println("enter string to reverse ");
		Original = sct.nextLine();
		int length = Original.length();
		
		for (int i = length-1;i>=0;i--)
			reverse = reverse+Original.charAt(i);
		System.out.println("Reverse entered string is"+ reverse);
		
		
		
		
		}

	}


