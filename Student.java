
public class Student {
	
	//Data Members/Instance Variables/Class Variables
	//Data Hiding - Make Variables Private
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}

		//Parameterized Constructor
	Student(int rollno, String name, String phone, String course, double fees)
	{
		//this(); // call to the default constructor
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;		
	}
	
	//Default Constructor
	Student()
	{
		this(1001, "Ram", "82748794879", "MCA", 10000.0); // call to the parameterized constructor
		collegeName = "SRCC";
	}
	
	
//	r, n, p, c, f - local variables
//	scope is with in the function
	//public void takeInput(int r, String n, String p, String c, double f)
//	public void takeInput(int rollno, String name, String phone, String course, double fees)
//	{
//		//instance variable = local variable
////		rollno = r;
////		name = n;
////		phone = p;
////		course = c;
////		fees = f;
//		
//		this.rollno = rollno;
//		this.name = name;
//		this.phone = phone;
//		this.course = course;
//		this.fees = fees;
//	}
	
	public void print()
	{
		System.out.println("Rollno: "+this.rollno); // this keyword is optional here, as it is implicitly work itself.
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		System.out.println("Course: "+course);
		System.out.println("Fees: "+fees);
		System.out.println("College Name: "+collegeName);
	}

	public static void main(String[] args) { // member function / method
		// TODO Auto-generated method stub
		Student ram = new Student(); // call to the default constructor
		
		//Student ram = new Student(1001, "Ram", "82748794879", "MCA", 10000.0); // parameterized cons call 
		// ram = reference variable
		//ram.takeInput(1001, "Ram", "82748794879", "MCA", 10000.0);
		
		ram.setPhone("9834792387");
		ram.print();
		
		
		/*
		System.out.println("Rollno: "+ram.rollno);
		System.out.println("Name: "+ram.name);
		System.out.println("Phone: "+ram.phone);
		System.out.println("Course: "+ram.course);
		System.out.println("Fees: "+ram.fees);
		*/
		
		/*
		ram.rollno = -1013;
		ram.name = "Ram";
		ram.phone = "2398649283";
		ram.course = "MCA";
		ram.fees = 1000.0;
		*/
		
		/*
		System.out.println("Rollno: "+ram.rollno);
		System.out.println("Name: "+ram.name);
		System.out.println("Phone: "+ram.phone);
		System.out.println("Course: "+ram.course);
		System.out.println("Fees: "+ram.fees);
		*/
	}

}
