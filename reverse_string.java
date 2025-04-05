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
