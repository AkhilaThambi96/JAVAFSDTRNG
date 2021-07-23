package com.ust.examples;


class Student3{
	int roll;
	void getData(int p) {
		roll = p;
	}
	void display()
	{
		System.out.println("roll no is:" + roll);
	}
}
class Test extends Student3{
	double p1,p2;
	void putMarks(double x,double y)
	{
		p1 = x;
		this.p2 = y;
	}
	void showMarks()
	{
	System.out.println("test1 = " + p1);
	System.out.println("test2 = " + p2);
	}
}

interface Sports
{
	double weight  = 50.0;
	void  showWeight();
}
class results extends Test implements Sports
{
	
double total;
public void showWeight()
{
		System.out.println("weight = " + weight);
	}
	void displayAll()
	{
		total = p1+p2+weight;
		display();
		showMarks();
		showWeight();
		System.out.println("total is = " + total);
	
	}
	
}
public class InterfaceStudent {

	public static void main(String[] args) {
		results r = new results();
		r.getData(101);
		r.putMarks(55.5,77.8);
		r.displayAll();
	}

}
