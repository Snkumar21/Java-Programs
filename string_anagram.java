// Example of Anagram String in java.
import java.util.Scanner;

public class string_anagram {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.trim().toLowerCase();
        str2 = str2.trim().toUpperCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count occurrences of each each character
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count characters in the first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Decrease the count for characters in the second string
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter first string: ");
            String str1 = scan.nextLine();

            System.out.println("Enter second string: ");
            String str2 = scan.nextLine();

            if (areAnagrams(str1, str2)) {
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }
        }
    }
}