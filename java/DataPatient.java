package com.ust.examples;


class Patient {
private String name;
private int age;
private boolean vaccinestatus;
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public boolean isVaccinestatus() {
	return vaccinestatus;
}

public void setVaccinestatus(boolean vaccinestatus) {
	this.vaccinestatus = vaccinestatus;
	
	if(vaccinestatus == true) {
		System.out.println("done a good job");
	}
	else {
		System.out.println("please got vaccinates ASAP");
	}
}


}

public class DataPatient {

	public static void main(String[] args) {
		Patient p =  new Patient();
		p.setVaccinestatus(false);
		
		System.out.println(p.isVaccinestatus());

	}

}
