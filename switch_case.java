import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number (choose from 1-7) :");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Monday");

                case 2 -> System.out.println("Tuesday");

                case 3 -> System.out.println("Wednesday");

                case 4 -> System.out.println("Thursday");

                case 5 -> System.out.println("Friday");

                case 6 -> System.out.println("Saturday");

                case 7 -> System.out.println("Sunday");

                default -> System.out.println("Invalid choice");
            }
        }
    }
}