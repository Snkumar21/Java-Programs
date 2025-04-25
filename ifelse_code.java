//This is if-else Condition code of java using User defined value.
import java.util.Scanner;

class ifelse_code{
	public static void main(String Args[]){
		try (Scanner uInput = new Scanner(System.in)) {
			int number;

			System.out.println("Enter an number: ");
			number = uInput.nextInt();

			if (number < 0) {
				System.out.println("The number is negative.");
			} else{
				System.out.println("The number is positive");
			}
		}
	}
}