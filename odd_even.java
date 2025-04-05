import java.util.Scanner;

class odd_even {
    public static void main(String[] Args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a number to check: ");
            int num = scan.nextInt();

            // This is correct 👌

            if ((num & 1) == 0) {
                System.out.println("The number is Even");
            }
            else {
                System.out.println("The number is odd");
            }
        }
    }
}