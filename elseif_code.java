<<<<<<< HEAD
import java.util.Scanner;

class elseif_code{
	public static void main(String Args[]){
	
		int number;

		Scanner uInput = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
        	number = uInput.nextInt();

        	if (number < 0) {
            		System.out.println("The number is Negative");
        	}
		else if(number > 0){
        		System.out.println("The number is Positive");
		}
		else {
        		System.out.println("The number is ZERO");
		}

	}
}
=======
//This is a else-if java code using user defined.
import java.util.Scanner;
class elseif_code {
	public static void main(String Args[]) {
	
		int number;
		Scanner uInput = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
        	number = uInput.nextInt();

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
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
