//This is a else-if java code using user defined.
import java.util.Scanner;
class elseif_code {
	public static void main(String Args[]) {
	
		int number;
		try (Scanner uInput = new Scanner(System.in)) {
			System.out.println("Enter an number: ");
				number = uInput.nextInt();
		}
		
		if (number < 0) {
            		System.out.println("The number is Negative");
        	}
		else if(number > 0) {
        		System.out.println("The number is Positive");
		}
		else {
        		System.out.println("The number is ZERO");
		}
	}
}