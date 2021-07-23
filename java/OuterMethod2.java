package com.ust.examples;
/*
 * 
 * local inner class example
 */

public class OuterMethod2 {
	private int data = 30;
	void display() {
		int value = 50;
		class local{
			void msg()
			{
				System.out.println(value);
				System.out.println(data);
			}
		}
			local l= new local();
			l.msg();	
		}
	

	public static void main(String[] args) {
		OuterMethod2 e =new OuterMethod2();
		e.display();

	}

}
