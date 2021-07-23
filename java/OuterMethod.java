package com.ust.examples;
/* 
 * method local inner class
 */
public class OuterMethod {
	void Method() {
		System.out.println("inside outer method");
		//inner class is local to outerMethod
	 class inner{
			void innerMethod() {
				System.out.println("inside inner method");
				
			}
		}
		inner y = new inner();
		y.innerMethod();
	}

	public static void main(String[] args) {
		OuterMethod outer = new OuterMethod();
		
	outer.Method();

	}

}
