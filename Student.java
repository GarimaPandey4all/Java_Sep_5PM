
public class Student {
	
	//Data Members/Instance Variables/Class Variables
	int rollno;
	String name;
	String phone;
	String course;
	double fees;

	public static void main(String[] args) { // member function / method
		// TODO Auto-generated method stub
		
		Student ram = new Student(); // ram = reference variable
		
		System.out.println("Rollno: "+ram.rollno);
		System.out.println("Name: "+ram.name);
		System.out.println("Phone: "+ram.phone);
		System.out.println("Course: "+ram.course);
		System.out.println("Fees: "+ram.fees);
		
		ram.rollno = 1001;
		ram.name = "Ram";
		ram.phone = "2398649283";
		ram.course = "MCA";
		ram.fees = 1000.0;
		
		System.out.println("Rollno: "+ram.rollno);
		System.out.println("Name: "+ram.name);
		System.out.println("Phone: "+ram.phone);
		System.out.println("Course: "+ram.course);
		System.out.println("Fees: "+ram.fees);

	}

}
