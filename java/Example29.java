package com.ust.examples;

 public class Example29 {
	int a =9;
	int b = 18;
	void m1() {
		a=10;
		b=20;
	
	}
 class test{
	 static void m1(Example29[] e) {
		 e[1].m1();
	 }
	 }
 class example{
	public static void main(String[] args) {
	Example29[] e1= {new Example29(),new Example29(),new Example29()};
	test.m1(e1);
	for(int i = 0;i<e1.length;i++) {
		System.out.println(e1[i].a+"\t");
		System.out.println(e1[i].b+"\n");
	}

	}
 }
}
