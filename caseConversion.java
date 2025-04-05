<<<<<<< HEAD
import java.util.Scanner;

public class caseConversion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            
            System.out.println("Uppercase: " + inputString.toUpperCase());
            System.out.println("Lowercase: " + inputString.toLowerCase());
        }
    }
}
=======
//This is Case Converter Code of Java
import java.util.Scanner;

public class caseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Uppercase: " + inputString.toUpperCase());
        System.out.println("Lowercase: " + inputString.toLowerCase());

        scanner.close();
    }
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
