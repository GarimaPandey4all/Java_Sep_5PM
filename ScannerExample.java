import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		char gender = scanner.next().charAt(0);
		
		int age = scanner.nextInt();
		
		long mobileNumber = scanner.nextLong();
		
		double cgpa = scanner.nextDouble();
		
		System.out.println("Name is: "+name);
		System.out.println("Gender is: "+gender);
		System.out.println("Age is: "+age);
		System.out.println("Mobile Number is: "+mobileNumber);
		System.out.println("CGPA is: "+cgpa);

	}

}
