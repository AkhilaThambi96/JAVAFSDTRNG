package com.ust.examples;
//depicting the use of nested if condition

public class IfCondition {
	float price;
	String item;

	public static void main(String[] args) {
		IfCondition e1=new IfCondition();
		IfCondition e2=new IfCondition();
		
		e1.price=1.2f;
		e2.price=1.2f;
		e1.item="pen";
		e2.item="book";
		
		if(e1.price>e2.price) {
			e1.item="scale";
			
		}
		if(e1.price<e2.price) {
			e1.item="pencil";
		}
		if(e1.price==e2.price) {
			e1.item="box";
		}
        System.out.println(e1.item);
    }
	
}
 		  


