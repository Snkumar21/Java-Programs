// This is a ODD-EVEN Code using For Loop.
// It will print all ODD-EVEN from 1 to 100 numbers.

class oddeven_forloop{
	public static void main(String Args[]){
	
		for( int i=1; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.println("The number is even " + i);
			}
			else	
			{
				System.out.println("The number is odd " + i);
			}
		}
	}
}
