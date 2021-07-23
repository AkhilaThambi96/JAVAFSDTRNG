package com.ust.examples;

import java.util.*;
import java.io.*;

class  Students implements Comparable<Students>{
	int id;
	String name;
	int age;
	 Students(int id,String name,int age){
		this.id=id;
		this.name= name;
		this.age= age;
	}
	
	 public int compareTo(Students s) 
	{
		if(age ==s.age)
			return 0;
		else if(age>s.age)
			return 1;
		else
			return -1;
	}
		

public class Comparable {

	public static void main(String[] args) {
		ArrayList<Students>  arr = new ArrayList<Students>();
		
		arr.add(new  Students(1,"aliya",21));
		arr.add(new Students(2," zruthi",22));
		arr.add(new Students(3," pathu",23));
		
		
		 Collections.sort(arr);
		 
			 for(Students s:arr) {
			 System.out.println(s.id+" "+s.name+" "+s.age);
		 }

	}

}
}








