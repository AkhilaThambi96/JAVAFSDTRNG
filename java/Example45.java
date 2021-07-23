package com.ust.examples;

public class Example45 {
	
	final static String name = "CONFIG";
	final long initTime;
	Example45(){
		this.initTime = System.currentTimeMillis();
	}
	public static void main(String[] args)
	{
		Example45 cfg1 = new Example45();
		System.out.println(cfg1.initTime);
		Example45 cfg2 = new Example45();
		System.out.println(cfg2.initTime);
	}
		
	}

	
	