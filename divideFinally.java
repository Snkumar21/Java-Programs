// Finally keyword used in Java Program
import java.util.Scanner;
public class divideFinally
{
    public static void main(String[] args) 
	{
		try (Scanner scan = new Scanner(System.in)) {
			//User defined numbers
			System.out.println("Enter the first number : ");
			int num1 = scan.nextInt();

			System.out.println("Enter the second number : ");
			int num2 = scan.nextInt();

			int result = num1 / num2; // Condition

			if(result != 0)
			{
				try{
					System.out.println(result);
				}
				catch(Exception e){
					System.out.println(e.toString());
				}
				finally{
					System.out.println("The denominator should not be 0.");
				}
			}
		}
    }
}