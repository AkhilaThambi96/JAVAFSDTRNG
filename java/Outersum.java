package com.ust.examples;

public class Outersum {
	
	private void getValue()
	{
		int sum = 20;
		class inner{
			public int divisor;
			public int remainder;
			public inner() {
				divisor = 4;
				remainder = sum%divisor;
			}
			private int getDivisor()
			{
				return divisor;
			}
			private int getReminder()
			{
				return sum%divisor;
				
			}
			private int getQuotient()
			{
				System.out.println("inside inner class");
				return sum/divisor;
			}
		}
		inner i=new inner();
		System.out.println("divisor = "+i.getDivisor());
		System.out.println("Remainder = "+i.getReminder());
		System.out.println("Quotient = "+i.getQuotient());
		
	}

	public static void main(String[] args) {
		Outersum e = new Outersum();
		e.getValue();

	}

}
