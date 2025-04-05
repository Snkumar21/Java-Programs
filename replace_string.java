import java.util.Scanner;

class replace_string {
    public static void main(String[] Args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the String: ");
            String str = scan.nextLine();
            System.out.println(str.replaceAll(" ","*"));
        }
    }   
}