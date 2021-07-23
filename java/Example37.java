package com.ust.examples;

 class super_class {
	 int num = 10;
	 public void display() {
		 System.out.println("This  is the  method of super class");
	 }
 }
public class  Example37 extends super_class{
	 public void display() {
		 int num= 20;
		 System.out.println("This  is the  method of subclass");
	 }

 	 public void method() {
		 Example37 s = new Example37();
		 s.display();
		 super.display();
		 System.out.println("value of the variable  named num in subclass:"+ s.num);
		 System.out.println("value of the variable  named num in superclass:"+ super.num);
	 }
	public static void main(String[] args) {
		Example37 e = new Example37();

		e.method();
		
	}

	}
