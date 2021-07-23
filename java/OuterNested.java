package com.ust.examples;

public class OuterNested {
	class inner{
		public void show() {
			System.out.println(" in  a nested class method");
			
		}
	}

	public static void main(String[] args) {
		OuterNested.inner n = new OuterNested().new inner();
		n.show();

	}

}
