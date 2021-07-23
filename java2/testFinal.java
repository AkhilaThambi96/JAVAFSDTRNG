package com.ust.examples;
/*
 * final example
 */
  class Vehicle1{
	int  x = 5;
	//constructor
	Vehicle1(){
		System.out.println("vehicle class constructor");
	}
 
	/*final void changeGear() {
		
		System.out.println("automatic variant");
	}
	*/
	void changeGear() {
		System.out.println("automatic variant");
	}
}
class Honda1 extends  Vehicle1{
	
/*	void changeGear1() {
		System.out.println("automatic variant in subclass");	
		super.changeGear();
	}
	*/
	
	void changeGear() {
		System.out.println("automatic variant in subclass");	
	}
}
public class testFinal {

	public static void main(String[] args) {
		Vehicle1 v = new Honda1();
		System.out.println(v.x);
		//Honda1 h = new Honda1();
		//	v.changeGear();
		//h.changeGear1();
 v.changeGear();
	}

}
