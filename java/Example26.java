package com.ust.examples;
/*
 * array of object
 * 
 */

public class Example26 {
	
	String fName;
	String lName;
	String city;
	String address;
	String dob;
	Float salary;
	
	Example26(String a,String b,String c,String d,String e,float x){
		fName = a;
		lName = b;
		city = c;
		address = d;
		dob = e;
		salary = x;
	}
	void display(){
		System.out.println(fName+" "+lName+" "+city+" "+address+" "+ dob+" "+salary);
	}

	public static void main(String[] args) {
		
/*Example26 e1 = new Example26("Akhila","Thambi","Malappuram","no 98,4th cross","24/10/1996",25000.0f);
Example26 e2 = new Example26("Alona","george","idukki","no 35,6th cross","04/06/1997",25000.0f);
Example26 e3 = new Example26("Arya","raj","idukki","no 32,4th cross","13/07/1997",25000.0f);
Example26 e4 = new Example26("sarmada","krishna","kochi","no 67,7th cross","01/08/1996",25000.0f);
Example26 e5 = new Example26("Arya","anandan","kozhikod","no 94,4th cross","24/03/1997",25000.0f);
*/
Example26 array[] = new Example26[5];
array[0] =new Example26("Akhila","Thambi","Malappuram","no 98,4th cross","24/10/1996",25000.0f); 
array[1] = new Example26("Alona","george","idukki","no 35,6th cross","04/06/1997",25000.0f);
array[2]  = new Example26("Arya","raj","idukki","no 32,4th cross","13/07/1997",25000.0f);
array[3]= new Example26("sarmada","krishna","kochi","no 67,7th cross","01/08/1996",25000.0f);
array[4] = new Example26("Arya","anandan","kozhikod","no 94,4th cross","24/03/1997",25000.0f);

for(int i=0;i<array.length;i++) {
	array[i].display();
}

/*e1.display();

e2.display();
e3.display();
e4.display();
e5.display();*/
	}

}
