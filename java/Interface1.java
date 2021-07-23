package com.ust.examples;

interface emp1{
	int id = 2011;
	void getid();
}


public class Interface1 {

	public static void main(String[] args) {
		emp1 e = new emp1()
				{
			public void getid() {
				System.out.println("employee id = "+ id);
			}
				
				};		
	e.getid();
		
				
	}

}
