package com.ust.examples;
/*
 * interface
 */
interface  first{
	public void method();
	
}
interface second{
	public void otherMethod();
	
}
public class InterfaceMultiple implements first,second{
	public void method() {
		System.out.println("some text....");
	}
	public void otherMethod() {
		System.out.println("some other text....");
	}
	



	public static void main(String[] args) {
		InterfaceMultiple d = new InterfaceMultiple();
		d.method();
		d.otherMethod();

	}

}
