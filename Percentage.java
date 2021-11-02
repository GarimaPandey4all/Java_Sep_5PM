import java.util.Scanner;

public class Percentage {
	
	//int marks[] = new int[5];
	private int marks[]; // data hiding
	
	public void setMarks()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Subjects:");
		int n = sc.nextInt();
		
		marks = new int[n];
		
		System.out.println("Enter your marks:");
		for(int i = 0; i < marks.length; i++)
		{
			marks[i] = sc.nextInt();
		}
	}
	
	public void calMarks()
	{
		int sum = 0;
		float percentage;
		
		for(int i = 0; i < marks.length; i++)
		{
			sum += marks[i]; // sum = sum + marks[i];
		}
		
		System.out.println("Marks is: "+sum);
		
		percentage = sum / marks.length;
		
		System.out.println("Percentage is: "+percentage);
		
		if(percentage <= 50 && percentage >= 60)
		{
			System.out.println("Grade D");
		}
		else if(percentage <= 60 && percentage >= 70)
		{
			System.out.println("Grade C");
		}
		else if(percentage <= 70 && percentage >= 80)
		{
			System.out.println("Grade B");
		}
		else if(percentage >= 80 && percentage <= 100)
		{
			System.out.println("Grade A");
		}
		else {
			System.out.println("Fail...");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Percentage s1 = new Percentage();
		
		s1.setMarks();
		s1.calMarks();
		
	}

}
