// This is ODD-EVEN finder code of java using user-defined value.
import java.util.Scanner;

class oddeven_code {
    public static void main(String[] args) {

        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = obj.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }

    }
}