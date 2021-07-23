package com.ust.examples;

public class OuterStatic {
	static class nested{
		public void method() {
			System.out.println("this is my nested class");
		}
	}

	public static void main(String[] args) {
		OuterStatic.nested n = new OuterStatic.nested();
		n.method();

	}

}
