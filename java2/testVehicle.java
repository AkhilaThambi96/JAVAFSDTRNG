package com.ust.examples;
/*
 * abstract example
 */
abstract class Vehicle{
	int  x = 5;
	//constructor
	Vehicle(){
		System.out.println("vehicle class instructor");
	}
	abstract void run();
	void changeGear() {
		System.out.println("automatic variant");
	}
}
class Honda extends  Vehicle{
	void run() {
		System.out.println("vehicle run sucessfully");	
		
	}
	void changeGear() {
		System.out.println("automatic variant in subclass");
		super.changeGear();
	}
}
public class testVehicle {

	public static void main(String[] args) {
		Vehicle v = new Honda();
		System.out.print(v.x);
		
		v.run();
		
		v.changeGear();

	}

}
