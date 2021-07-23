package com.ust.examples;

class TestData {
	private String name;
	private int age;
	private float salary;
	
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class TestDataHiding {

	public static void main(String[] args) {
		TestData t = new TestData();
		t.setName("Akhila");
		t.setSalary(2000);
		t.setAge(24);
		System.out.println(t.getName()+" "+t.getSalary()+" "+t.getAge());

	}

}
