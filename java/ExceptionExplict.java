package com.ust.examples;

import java.net.MalformedURLException;
import java.net.URL;


public class ExceptionExplict {

	public static void main(String[] args)throws MalformedURLException {
		try
		{
			URL url = new URL("http://www.google.com");
		}
finally {
	System.out.println("in finally block");
}
	}

}
