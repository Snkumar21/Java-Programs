import java.util.Scanner;

public class lcm_and_hcf {
    // Function to calculate HCF using Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the formula: LCM(a, b) = (a * b) / HCF(a, b)
    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        // User input
        try (Scanner scanner = new Scanner(System.in)) {
            // User input
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            
            // Calculate HCF and LCM
            int hcf = findHCF(num1, num2);
            int lcm = findLCM(num1, num2);
            
            // Output results
            System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        }
    }
}
