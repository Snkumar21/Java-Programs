// How to scan a code in java.
import java.util.Scanner;

class scanner_code {
    public static void main(String Args[]) {
        try (Scanner uInput = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            int num1 = uInput.nextInt();
            System.out.println("The entered int number is " + num1);

            System.out.println("Enter a float number: ");
            float num2 = uInput.nextFloat();
            System.out.println("The entered float number is: " + num2);

            System.out.println("Enter a double number: ");
            double num3 = uInput.nextDouble();
            System.out.println("The entered double number is: " + num3);

            System.out.println("Enter a string: ");
            String str1 = uInput.next();  
            System.out.println("The entered string is: " + str1);
        }
    }
}