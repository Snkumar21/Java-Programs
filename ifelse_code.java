<<<<<<< HEAD
import java.util.Scanner;

class ifelse_code{
	@SuppressWarnings("resource")
	public static void main(String Args[]){
	
		int number;

		Scanner uInput = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
        	number = uInput.nextInt();

        	if (number < 0) {
            		System.out.println("The number is negative.");
        	}
		else{
        		System.out.println("The number is positive");
		}

	}
}
=======
//This is if-else Condition code of java using User defined value.
import java.util.Scanner;

class ifelse_code{
	public static void main(String Args[]){
	
		int number;

		Scanner uInput = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
        	number = uInput.nextInt();

        	if (number < 0) {
            		System.out.println("The number is negative.");
        	}
		else{
        		System.out.println("The number is positive");
		}

	}
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
