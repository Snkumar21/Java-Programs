import java.util.Scanner;

public class datastructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        // Loop for worst-case scenario: Invalid inputs
        while (true) {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            if (age < 0 || age > 120) {
                System.out.println("Invalid age! Please enter a valid age (0 - 120).");
            } else {
                break; // Exit loop when age is valid
            }
        }

        // Check voting eligibility (Best, Average, and other valid cases)
        if (age < 18) {
            System.out.println("You are not eligible to vote.");
        } else if (age == 18) {
            System.out.println("Congratulations! You just became eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }


        scanner.close();
    }
}