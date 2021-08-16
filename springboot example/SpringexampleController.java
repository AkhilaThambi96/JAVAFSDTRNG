package com.ust.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringexampleController {
	@RequestMapping("/abc")

	public String printJunk()
	{
		System.out.println("controlled");
		return "index.jsp";
	}
	
	
	@RequestMapping("/cdf")

	public void printJunk1()
	{
		System.out.println("controlled1");
	}

}
