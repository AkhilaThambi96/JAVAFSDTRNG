package com.ust.examples;
/*
 * interface
 */
interface animals{
	public void animalSound();//interface method(does not have a body)
	public void sleep();//interface method 
}

class pigs implements animals{
	public void animalSound() {
		//body of animalSound is provided here
		System.out.println("the pig says: wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}
public class InterfaceAnimal {
	public static void main(String[] args) {
		pigs p = new pigs();//create a pig object
		p.animalSound();
		p.sleep();

	}

}
