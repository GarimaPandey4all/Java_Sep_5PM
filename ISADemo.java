package com.brainmentors.java.oops;

class Person { // parent class
	private String name;
	
	public Person()
	{
		//super();
		name = "Ram";
	}
	
	public void printName()
	{
		System.out.println("Name of the person is: "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Contact Number of Person");
	}
}

//child class
class Stdent extends Person  // inheritance
{
	private int id;
	
	public Stdent()
	{
		super(); // Parent Default Cons Call (Implicit Super Call)
		id = 101;
	}
	
	public void printId()
	{
		System.out.println("Student id is: "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Contact Number of Student");
	}
}

public class ISADemo {
	public static void main(String[] args) {
		
//		S : Single Responsibility Principle
		
		Stdent student = new Stdent();
		student.printId();
		student.printName();
		student.contNumber();
		Person person = new Person();
		person.contNumber();
		
	}

}
