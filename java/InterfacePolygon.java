package com.ust.examples;

interface polygon{
	void getArea(int length,int breadth);
	
}
class Rectangle  implements polygon{
	public void getArea(int length,int breadth) {
		System.out.println("the area of the rectangle is"+(length*breadth));
	}
}
class square  implements polygon{
	public void getArea(int length,int breadth) {
		System.out.println("the area of the square is"+(length*length));
	}

public class InterfacePolygon {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.getArea(5,6);
		square t = new square();
		t.getArea(5,0);

	}

}
}
