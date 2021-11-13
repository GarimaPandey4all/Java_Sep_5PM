package com.brainmentors.java.oops;

class A {
	
	int x;
	
	A()
	{
		//this(20);
		System.out.println("A Default Cons Call");
	}
	
	A(int x)
	{
		this();
		this.x = x;
		System.out.println("A Param Cons Call");
	}
}

class B extends A {
	
	int x;
	
	B()
	{
		super(100);
		//this(10);
		System.out.println("B Default Cons Call");
	}
	
	B(int x)
	{
		this();
		this.x = x;
		System.out.println("B Param Cons Call");
	}
}



public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B(99);

	}

}
