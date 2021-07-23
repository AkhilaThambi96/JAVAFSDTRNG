package com.ust.examples;
/* This example depicts
 *  the usage of local 
 *  static instance  variable
 * 
 * 
 * 
 */
public class InstanceVariable {
    String Name;//instance variable
    float Price;//instance variable
    static int Count;//static variable
	
	public static void main(String[] args) {
		int age=10;//local variable
		System.out.println(age);
		InstanceVariable e =new InstanceVariable();
		e.Name="akhila";
		e.Price=1.2f;
		Count=6;
		System.out.println(e.Name);
		System.out.print(Count);
		System.out.print(e.Price);
		
	}

}
