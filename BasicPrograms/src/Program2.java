
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//equals() vs equalsIgnoreCase()
		
		String s1 = "hello"; // literals = constant
		String s2 = "Hello";
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String s1 is equal to String s2");
		}
		else {
			System.out.println("String s1 is not equal to String s2");
		}
		
		if(s1.equals(s2)) {
			System.out.println("String s1 is equal to String s2");
		}
		else {
			System.out.println("String s1 is not equal to String s2");
		}

	}

}
