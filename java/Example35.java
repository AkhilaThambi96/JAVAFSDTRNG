package com.ust.examples;


 class Employee {
	 float salary = 50000;
 }
 public class Example35 extends Employee{
	 int bonus = 2000;

	public static void main(String[] args) {
		Example35 p  = new Example35();
		System.out.println("programmer salary is "+ p.salary);
		System.out.println("bonus ofprogrammer is "+ p.bonus);


	}

}
