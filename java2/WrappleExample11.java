package com.ust.examples;

public class WrappleExample11 {

	public static void main(String[] args) {
		//initialize the class with integer data
		DemoClass demo = new DemoClass();
		demo.<String>genericsMethod("java programming");
		
		//generics method working working with integer
		demo.<Integer>genericsMethod(25);
		
	}
}
class DemoClass{
	//create a generic method
	public<T>void genericsMethod(T data){
		System.out.println("Generics Method");
		System.out.println("Data passed:"+data);
		}
}
