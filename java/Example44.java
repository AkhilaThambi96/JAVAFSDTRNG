package com.ust.examples;
/*
 * final method
 */


class base{
	final void display()
	{
		System.out.println("base method called");
	}
}
class derived extends base{
	void display1() {
		System.out.println("base method ");
	}
	
}
public class Example44 {

	public static void main(String[] args) {
		derived d = new derived();
		d.display();

	}

}
