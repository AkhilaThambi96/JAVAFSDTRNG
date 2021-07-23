package com.ust.examples;

enum Direction{
	EAST,
	WEST,
	NORTH,
	SOUTH
}

public class Enum2 {

		Directions d;
		public Enum2(Directions d) {
			this.d  = d;
		}
		public void getMyDirection() {
			switch(d) {
			case EAST:
				System.out.println("in East Direction");
				break;
			case WEST:
				System.out.println("in West Direction");
				break;
			case NORTH:
				System.out.println("in North Direction");
				break;
			default:
				System.out.println("in South Direction");
				break;
				
			}
		}
		public static void main(String[] args) {
			Enum2 e = new Enum2(Directions.EAST);
			e.getMyDirection();
			Enum2 e1 = new Enum2(Directions.SOUTH);
			e1.getMyDirection();
			
	}
}
