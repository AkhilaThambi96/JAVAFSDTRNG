package com.ust.examples;


enum Direction1{
	EAST("E"),
	WEST("W"),
	NORTH("N"),
	SOUTH("S");
	
	private final String shortCode;
	Direction1(String code){
		this.shortCode = code;
		
	}
	public String getDirectionCode() {
		return this.shortCode;
	}
}

public class Enum3 {

	public static void main(String[] args) {
		Direction1 d = Direction1.SOUTH;
		System.out.println(d.getDirectionCode());
		Direction1 d1 = Direction1.EAST;
		System.out.println(d1.getDirectionCode());
		

	}

}
