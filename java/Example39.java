package com.ust.examples;

abstract class Animal1{
	abstract void makeSound();
	
}
class  Dog_name extends Animal1{
	public void makeSound() {
		System.out.println("dog bark");
	}
}
class  Cat extends Animal1{
	public void makeSound() {
		System.out.println(" cat meow");
	}
}

public class Example39 {

	public static void main(String[] args) {
		Dog_name d = new Dog_name();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
	

	}

}
