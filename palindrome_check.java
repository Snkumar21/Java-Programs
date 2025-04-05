<<<<<<< HEAD
import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            
            String reversed = new StringBuilder(inputString).reverse().toString();
            if (inputString.equals(reversed)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}
=======
// This is a palindrome checker code using user-defined value.
import java.util.Scanner;

public class palindrome_check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversed = new StringBuilder(inputString).reverse().toString();
        if (inputString.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
