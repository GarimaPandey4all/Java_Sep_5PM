package com.brainmentors.java.oops;

public class Student {
	
	private int id;
	private double fees;
	private String name;
	
	public Student(int id, double fees, String name) {
		this(id, name);
		//this.id = id;
		this.fees = fees;
		//this.name = name;
	}

	public Student(int id, String name) {
		//this(id, 10000.0, name);
		this.id = id;
		this.name = name;
	}
	
	void print()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(fees);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student shyam = new Student(101, 10000.0, "Shyam");
		shyam.print();

	}

}
