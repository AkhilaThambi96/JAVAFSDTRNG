package com.ust.examples;

public class OuterMethod1 {
	private int data = 30;//instance variable
	void display() {
		class local{
			void msg(){
				System.out.println(data);
			}
			
		}
		local l = new local();
		l.msg();
	}

	public static void main(String[] args) {
		OuterMethod1 e = new OuterMethod1();
		e.display();

	}

}
