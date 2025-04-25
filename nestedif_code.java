// This is a Nested Loop Code using user-defined value in java.
import java.util.Scanner;

public class nestedif_code {
	public static void main(String Args[]) {
	
		int number;

		try (Scanner uInput = new Scanner(System.in)) {
			System.out.println("Enter an number: ");
			number = uInput.nextInt();
		}
		
		if (number <= 10) {
			if (number < 0) {
				System.out.println("The number is negative");
			}else {
				System.out.println("The number is smaller than 10");
			}
        }else {
			System.out.println("The number is greater than 10");
		}
	}
}