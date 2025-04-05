<<<<<<< HEAD
import java.util.Scanner;

public class character_Index {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            
            System.out.print("Enter the character to find: ");
            char characterToFind = scanner.next().charAt(0);
            
            int index = inputString.indexOf(characterToFind);
            if (index != -1) {
                System.out.println("The character '" + characterToFind + "' is at index: " + index);
            } else {
                System.out.println("Character not found.");
            }
        }
    }
}
=======
//This is a Character Index in Java Program
import java.util.Scanner;

public class character_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char characterToFind = scanner.next().charAt(0);

        int index = inputString.indexOf(characterToFind);
        if (index != -1) {
            System.out.println("The character '" + characterToFind + "' is at index: " + index);
        } else {
            System.out.println("Character not found.");
        }

        scanner.close();
    }
}
>>>>>>> 3b91145e87f179c688b01060e6f387c287eacd71
