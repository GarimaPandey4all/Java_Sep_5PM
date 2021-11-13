package com.brainmentors.java.oops;

class X { // parent class
	protected String name = "Brain Mentors";
}

class Y  extends X{ // Y- child class
	public void print()
	{
		System.out.println(name);
	}
}

public class ProtectedUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Y obj = new Y();
		obj.print();
	}

}
