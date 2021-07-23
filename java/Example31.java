package com.ust.examples;
/*
 * 
 * credit class is superclass
 */
// credit cards is a super class
  class creditCards {
	
	private String cardName;//instance variable
	 private int expiryDate;
	private float creditBalance;
	
	creditCards(){
		cardName = "akhila";
		expiryDate = 24/11/2024;
		creditBalance = 5000;
	}
	 void checkCardBalance() {
	if(creditBalance<30000) {
		System.out.println("sufficcent balance");
	}
	else
	{
		System.out.println(" not sufficcent balance");
	}
	}
	 void makepayment() {}
  }
	//visa is sub class
	class visa extends creditCards{
		float interestRate;
		int creditLimit;
		visa(){
			super();
		}
		
		void checkDiscount()
		{
			System.out.println(" discounts will be provided");
		}
	}
	//master card is subclass
	class Matercard extends creditCards{
		void checkpointoptions()
		{
			System.out.println(" online payment mode is available");
		}
	}
	
 public class Example31{
	
	
	public static void main(String[] args) {
		//visa  e1 = new visa("akhila",123,3000.5f);
		visa v = new visa();
		v.checkCardBalance();

	}

}
