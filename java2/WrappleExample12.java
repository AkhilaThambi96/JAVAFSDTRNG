package com.ust.examples;


public class WrappleExample12 {
	public static void main(String[] args) {
		class GenericsClass<T extends Number>
		{
public void display() {
	System.out.println("This is a bounded type generics class");
	
}
	}
//create an object of generics class
		GenericsClass<Integer>Obj = new GenericsClass<>();
		Obj.display();
}
}