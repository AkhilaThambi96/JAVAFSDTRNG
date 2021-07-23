package com.ust.examples;

public class Example15 {

	public static void main(String[] args) {
		int[]numbers= {2,6,-4,7,34,-4,7,34,-58};
		int sum=0;
		double average;
		for (int number:numbers) {
			sum+=number;
		}
		int arrayLength = numbers.length;
		
		average = ((double)sum/(double)arrayLength);
		System.out.println("Sum="+ sum);
		System.out.println("Average="+ average);

	}

}
