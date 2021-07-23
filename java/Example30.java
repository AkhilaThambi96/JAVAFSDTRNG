package com.ust.examples;


 class Bank {
	private int accountno;
	private String accountname;
	private float accountbalance;
	

	
void printBankdetails() {
	System.out.println(accountno+"\n "+accountname+"\n "+accountbalance);
}
void insertBankData(int x,String y,float z) {
	accountno = x;
	accountname=y;
	accountbalance=z;
}
} 
  class Example30{

	public static void main(String[] args) {
	Bank e = new Bank();
	e.insertBankData(123, "akhila", 10000);
	e.printBankdetails();
		

	
}
}
