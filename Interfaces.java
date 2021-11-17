package com.brainmentors.java.oops;

//Multiple Interface
interface Printable {
	void print();
}

interface Showable {
	void show();
}

//Child Class
class MInterfaces implements Printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
	
}

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MInterfaces obj = new MInterfaces();
		obj.print();
		obj.show();
	}

}
