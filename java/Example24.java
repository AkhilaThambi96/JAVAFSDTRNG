package com.ust.examples;
/*
 * 
 * constructor
 */
public class Example24 {
	
	int x;
	float y;
	String z;
	
	Example24(){}
	
	Example24(int x ,float y){
		this.x =x;
		this.y = y;
	}
		Example24(int a ,float b,String c){
			this(a,b);
			//x =a;
			//y = b;
			z = c;
	}

	public static void main(String[] args) {
		Example24 e = new Example24();
		System.out.println(e.x);
		
		Example24 e2 = new Example24(2,3.4f);
		System.out.println(e2.y);
		
		Example24 e3 = new Example24(3,4.0f,"akhila");
		System.out.println(e3.z);

	}

}
