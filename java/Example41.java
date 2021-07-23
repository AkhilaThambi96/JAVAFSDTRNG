package com.ust.examples;
/*
 * overloading
 */

public class Example41{
	private String formatNumber(int value) {
		return String.format("%d", value);
	}
	private String formatNumber(double value) {
		return String.format("%3f", value);
	}
	private String formatNumber(String value) {
		return String.format("%2f", Double.parseDouble(value));
	}
	
	




	public static void main(String[] args) {
		Example41 hs = new Example41();
		System.out.println(hs.formatNumber(500));
		System.out.println(hs.formatNumber(89.9765));
		System.out.println(hs.formatNumber("500"));

	}

}
