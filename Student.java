
public class Student {
	
	//Data Members/Instance Variables/Class Variables
	//Data Hiding - Make Variables Private
	private int rollno;
	private String name;
	private String phone;
	private String course;
	private double fees;
	
//	r, n, p, c, f - local variables
//	scope is with in the function
	public void takeInput(int r, String n, String p, String c, double f)
	{
		//instance variable = local variable
		rollno = r;
		name = n;
		phone = p;
		course = c;
		fees = f;
	}
	
	public void print()
	{
		System.out.println("Rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Phone: "+phone);
		System.out.println("Course: "+course);
		System.out.println("Fees: "+fees);
	}

	public static void main(String[] args) { // member function / method
		// TODO Auto-generated method stub
		
		Student ram = new Student(); // ram = reference variable
		ram.takeInput(1001, "Ram", "82748794879", "MCA", 10000.0);
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
