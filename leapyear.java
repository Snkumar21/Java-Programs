// This is a leap year code using user defined structure in java.
import java.util.Scanner;

class leapyear {
	public static void main(String Args[]) {
	
		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter the year : ");
			int year = obj.nextInt();
			
			if(year % 400 == 0)
			{
				System.out.println("Leap Year");
			}else{
				System.out.println("Not Leap Year");
			}
		}
	}
}