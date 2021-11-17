package com.brainmentors.java.oops;

abstract class People {
	
	private String name;
	private int age;
	
	public People(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void printData()
	{
		System.out.println(name +" "+ age);
	}
	
	public abstract void contNumber(); // abstract method declared only
}

class Student1 extends People {
	private int id;
	
	public Student1(int id)
	{
		super("brain", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println(id);
	}

	@Override
	public void contNumber() {
		// TODO Auto-generated method stub
		System.out.println("Student Contact Number");
	}
}

public class AbstractConcept {
	
	public static void main(String[] args) {
		
		Student1 student = new Student1(100);
		student.printData();
		student.printId();
		student.contNumber();
		
		//People person = new People(); // error
		
	}

}
