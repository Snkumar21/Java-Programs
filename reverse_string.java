<<<<<<< HEAD
import java.util.Scanner;

class reverse_string {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            
            String reversed = new StringBuilder(inputString).reverse().toString();
            System.out.println("Reversed string: " + reversed);
        }
        
    }
}
=======
// This is a program for reverse a string using user defined in java program.
import java.util.Scanner;

public class reverse_string
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversed = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
