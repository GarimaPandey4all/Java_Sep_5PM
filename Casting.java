package com.brainmentors.java.oops;

class Parent {
	
	public void display()
	{
		System.out.println("Method of Parent Class");
	}
}

class Child extends Parent {
	public void display()
	{
		System.out.println("Method of Child Class");
	}
}

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//child object typecasted into parent object
		
		//Upcasting
//		Parent obj = (Parent)new Child();
//		obj.display();
		
		//downcasting
		
		//parent object typecasted into child object
		
		//Child c = new Parent(); // Compile Time error
		
		Parent p = new Child();
		Child c = (Child)p;
		
		c.display();
		
	}
}
