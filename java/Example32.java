package com.ust.examples;

 class animal {
	 //field and method of the parent class
	 String name;
	 public void eat() {
		 System.out.println(" i can eat");
	 }
 }
	//inherit from animal
 class Dog extends animal{
	 public void display() {
		 System.out.println("my name  is" +" "+ name);
	 }
 }
 class Example32{
 public static void main(String[] args) {
		Dog labrador = new Dog();
		labrador.name = "rohu";
		labrador.display();
		labrador.eat();
		

	}

}
