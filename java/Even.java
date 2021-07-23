package com.ust.examples;
import java.util.Scanner;

public class Even {
	
	
	public static void main(String[] args) {
		int n ;
		System.out.println("enter a number");
	//	int x = 10;
		//int y = 10;
	//System.out.println("sum = " + (x+y));
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	if(n%2 ==0)	
		System.out.println("even number");
	
	else
	
		System.out.println("odd number");

	}

}
