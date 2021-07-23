package com.ust.examples;
/*
 * example of outer and inner class
 */
//outer class
public class OuterClass {
	private int x;//instance variable
	//method
	void display() {
		 System.out.println("outer class");	
	}
	//inner class
	private class Inner{
		  void display() {
			  System.out.println("example of inner class");
		  }
	  }

	public static void main(String[] args) {
		OuterClass.Inner e = new OuterClass().new Inner();
		OuterClass e1 = new OuterClass();
		e1.display();
		e1.x = 5;
		
		System.out.println(e1.x);
		
		e.display();
  
	}

}
