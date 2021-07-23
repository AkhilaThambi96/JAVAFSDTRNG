package com.ust.examples;
/*
 * abstract class
 */
abstract class Car{
	int x;
	abstract void insuranceDetails();
	void display() {}
	
}


public class Example38 extends Car {
	
	void insuranceDetails() {
		System.out.println("provide the insurance details");
	}

	public static void main(String[] args) {
		 Example38 h = new  Example38();
		 Car c = new  Example38();
		 c.insuranceDetails();
		 h.insuranceDetails();

	}

}
