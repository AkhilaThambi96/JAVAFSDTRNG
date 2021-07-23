package com.ust.examples;

abstract class Sum
{
	public abstract int sumOfTwo(int n1,int n2);
	public abstract int sumOfTwo(int n1,int n2,int n3);
	public void disp()
	{
		System.out.println("method class sum");
	}
}
class Example46 extends Sum
{
	public  int sumOfTwo(int num1,int num2) {
		return num1+num2;
	}
	
	public int sumOfTwo(int n1, int n2, int n3) {
	return n1 +n2+n3;
	}

	public static void main(String[] args) {
		Sum s = new Example46();
		System.out.println(s.sumOfTwo(3, 7));
		System.out.println(s.sumOfTwo(4,3,9));
		s.disp();
		

	}

	
	}


