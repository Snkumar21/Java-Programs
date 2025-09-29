import java.util.*;

public class stackReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        // Input elements
        System.out.println("Enter number of elements in stack:");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Original Stack (Top to Bottom): " + stack);

        System.out.print("Stack in Reverse Order (Bottom to Top): ");
        printReverse(stack);
    }

    // Method to print stack in reverse order (without modifying it)
    public static void printReverse(Stack<Integer> stack) {
        // Convert stack to array
        Object[] arr = stack.toArray();

        // Print from first element (bottom) to last element (top)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}