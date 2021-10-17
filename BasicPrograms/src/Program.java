
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//== vs equals()
				
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println(s1 == s2); // false: reference comparison
		System.out.println(s1.equals(s2)); // true: value/content comparison

	}

}
