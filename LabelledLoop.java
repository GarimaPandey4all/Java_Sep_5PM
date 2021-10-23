
public class LabelledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//labelled loop
		
		int i, j;
		
	label1:	for(i = 1; i <= 5; i++)
		{
		label2:	for(j = 1; j <= 5; j++)
			{
				System.out.print(i);
				
				if(j == 5) {
					break label1;
				}
			}
			
			System.out.println();
		}

	}

}
