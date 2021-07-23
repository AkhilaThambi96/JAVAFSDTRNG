package com.ust.examples;
/*
 * 
 * 
 */

public  class Example14 {
	int id;
	String name;
	float salary;
	void insert(int i, String n,float s ) {
		id = 1;
		name= n;
		salary=s;
	}
		void display()
		{
			System.out.println(id+" "+name+" "+salary);
		}
 
		
			public static void main(String[] args) {
				Example14 e1 =new  Example14();
				e1.insert(1,"Akhila",5700);
				e1.display();
				
				Example14 e2 =new  Example14();
				e2.insert(2,"Alona",75000);
				e2.display();
				
				Example14 e3 =new  Example14();
				e3.insert(3,"Arya",5700);
				e3.display();
				
				
		}
	}



	


