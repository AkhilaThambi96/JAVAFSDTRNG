package com.ust.examples;
/*
 * 
 * find average
 */

public class Example18 {

	public static void main(String[] args) {
		double array[] = {2,2,2};
		double sum = 0.0;
		double average = 0.0;
		for(int i = 0;i<array.length;i++) {
			sum=sum+array[i];
			
		}
 
		average=sum/array.length;
		System.out.println("AVERAGE:" + average);
	}

}
