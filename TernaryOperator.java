import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		conditional
		Ternary: 3, ? :
		
		(condition) ? True : False;*/
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		
//		if(a > b)
//		{
//			System.out.println("A is Greater");
//		}
//		else {
//			System.out.println("B is Greater");
//		}
		
		int result = (a > b) ? a : b;
		String result2 = (a % 2 == 0) ? "Number is Even" : "Number is Odd";
		
		System.out.println("Greatest Number is: "+result);	
		System.out.println(result2);

	}

}
