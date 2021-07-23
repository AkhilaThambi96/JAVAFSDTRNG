package com.ust.examples;


 enum Directions{
	EAST,
	WEST,
	NORTH,
	SOUTH
}

public class Enum1 {

	public static void main(String[] args) {
		Directions d=Directions.SOUTH;
		if(d ==Directions.EAST) {
			System.out.println("Directions:East");
			
		}
		else if(d ==Directions.WEST) {
			System.out.println("Directions:West");
	}
		else if(d ==Directions.NORTH) {
			System.out.println("Directions:North");
	}
		else {
			System.out.println("Directions:South");
		}
	}
}
