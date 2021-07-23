package com.ust.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class  Student5{
	int id;
	String name;
	int age;
	 Student5(int id,String name,int age){
		this.id=id;
		this.name= name;
		this.age= age;
	}
}
class NameComparator implements Comparator
{
	
	public int compare(Object obj1,Object obj2)
	{
		 Student5 s1 =( Student5)obj1;
		 Student5 s2 =( Student5)obj2;
		return s1.name.compareToIgnoreCase(s2.name);
		
	}
}

public class Comparator1 {

	public static void main(String[] args) {
		ArrayList  arr = new ArrayList();
		
		arr.add(new  Student5(1," Akhila",24));
		arr.add(new Student5(2," sruthi",23));
		arr.add(new Student5(3," chinnu",23));
		
		 System.out.println("SORTING BY NAME");
		 Collections.sort(arr,new NameComparator());
		 Iterator itr = arr.iterator();
		
		 
		 while(itr.hasNext())
		 {
			 Student5 st =(Student5)itr.next();
			 System.out.println(st.id+" "+st.name+" "+st.age);
		 }

	}

}
