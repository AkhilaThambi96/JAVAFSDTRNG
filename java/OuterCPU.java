package com.ust.examples;
	
	//outer class
	public class OuterCPU{
		double price;
	//nested class
		 class Processor{
			double cores;
			String manufacturer;
			
			double getCache() {
				return 4.3;
			}
		}
		protected class RAM{
			double memory;
			String manufacturer;
			
			double getClockSpeed() {
				return 5.5;
				
			}
			
		}
		
	



	public static void main(String[] args) {
		// create object of outer class CPU
		OuterCPU c = new OuterCPU();
		OuterCPU.Processor p = c.new Processor();
		OuterCPU.RAM r = c.new RAM();
		
		
		System.out.println("processor Cache = "+p.getCache());
		System.out.println("RAM clock speed = "+r.getClockSpeed());
		
	}
	}


