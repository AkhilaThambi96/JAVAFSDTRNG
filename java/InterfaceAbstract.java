package com.ust.examples;

abstract class Person
{
	abstract void eat();
}

	public class InterfaceAbstract {
		

	public static void main(String[] args) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
			p.eat();
	}

}
