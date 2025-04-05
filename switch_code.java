import java.util.Scanner;

class switch_code{
	@SuppressWarnings("resource")
	public static void main(String Args[]){

		Scanner uInput = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int numS = uInput.nextInt();
        
        switch (numS) {
			case 1 -> System.out.println("One");

			case 2 -> System.out.println("Two");
			
			case 3 -> System.out.println("Three");

			default -> System.out.println("The number does not exist");
		}

	}
}