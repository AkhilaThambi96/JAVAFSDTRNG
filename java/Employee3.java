package com.ust.examples;

 abstract class Employ{
	private String name;
	private int Emplohour;
	void display() {
		System.out.println("name is"+" "+name+"\n"+"employee hour is"+" "+Emplohour);
		
	}
	public Employ() {
		
	}
	public Employ(String name,int Emplohour) {
		this.name = name;
		this.Emplohour = Emplohour;		
	}
	
	public void  setname(String name) {
		this.name = name;
			
	}
	public String getname() {
		return name;
	}
	public  void setEmplohour(int Emplohour) {
		this.Emplohour = Emplohour;
	}
	

public int getEmplohour() {
	return Emplohour;
}
abstract void salary(int x , int y);
 }
public class Employee3 extends Employ{
	Employee3(){
		super();
	}
Employee3(String name,int Emplohour){
		super (name, Emplohour);
	}
	void salary(int days,int total_sal) {
		if((total_sal/days)>500){
			System.out.println("the pay is good");
		}
		else {
			System.out.println("the pay is  not good");
		}
	}
	
	
	public static void main(String[] args) {
		Employee3 e1 = new Employee3("akhila",15);
		e1.display();
		Employee3 e2 = new Employee3();
		e2.setname("alina");
		System.out.println(e2.getname());
		e2.salary(10,10000);
	
	}

}
