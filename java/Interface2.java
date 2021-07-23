package com.ust.examples;

interface emp{
	int id = 2020;
	void getid();
}
public class Interface2  implements emp
{
	
	public void getid()
	{
	System.out.println("employee id = "+ id);
	}




	public static void main(String[] args) {
		Interface2 i = new Interface2();
		i.getid();
		

	}

}
