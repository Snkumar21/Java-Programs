// This ODD-EVEN Code using while Loop.
// This will print all ODD-EVEN Numbers from 1 to 100.

class oddeven_whileloop{
	public static void main(String Args[]){
	
		int i = 1;
		
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println("The number is even " + i);
			}
			else	
			{
				System.out.println("The number is odd " + i);
			}
			i++;
		}
	}
}
