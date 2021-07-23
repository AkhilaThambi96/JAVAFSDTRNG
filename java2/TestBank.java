package com.ust.examples;
/*  abstract example
 */
abstract class Bank_Name{
	abstract int getInterestRate();
}
class HDFC extends Bank_Name{
	int getInterestRate() {
		return 10;
	}
}

class ICIC extends Bank_Name{
	int getInterestRate() {
		return 8;
}
}

public class TestBank {

	public static void main(String[] args) {
		Bank_Name b = new HDFC();
System.out.println(b.getInterestRate());

 b = new ICIC();
System.out.println(b.getInterestRate());


	}

}
