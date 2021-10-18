import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IssueWithScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an age:");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter your name:");
		String name = br.readLine();
		
		System.out.println("You have entered " +age+" "+name);

	}

}
