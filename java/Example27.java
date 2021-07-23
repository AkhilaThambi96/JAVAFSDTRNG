package com.ust.examples;
/*
 * constructor
 */

public class Example27 {
	String web;
	Example27(String w){
		web=w;
	}
Example27(Example27 cc){
	web=cc.web;
}
void display() {
	System.out.println("constructor."+web);
}
	public static void main(String[] args) {
		Example27 e1 = new Example27("example of copy constructor in java");
		Example27 e2 = new Example27(e1);
		e1.display();
		e2.display();
		
		
		

	}

}
