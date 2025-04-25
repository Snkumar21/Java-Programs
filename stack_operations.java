// Example of Stack Operations in java
import java.util.Scanner;
import java.util.Stack;

public class stack_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int[] stackArray = new int[100]; // Array to hold elements
        int top = -1; // Index tracker for stackArray

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    // Push operation
                    System.out.print("Enter a number to push: ");
                    int num = sc.nextInt();
                    stack.push(num);

                    // Store in array
                    if (top < stackArray.length - 1) {
                        stackArray[++top] = num;
                    } else {
                        System.out.println("Stack overflow in array!");
                    }
                    System.out.println(num + " pushed onto the stack.");
                }

                case 2 -> {
                    // Pop operation
                    if (!stack.isEmpty()) {
                        int popped = stack.pop();
                        top--; // Adjust array index
                        System.out.println("Popped element: " + popped);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                }

                case 3 -> {
                    // Peek operation
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                }

                case 4 -> {
                    // Display stack elements
                    if (top == -1) {
                        System.out.println("Stack is empty!");
                    } else {
                        System.out.print("Stack elements: ");
                        for (int i = 0; i <= top; i++) {
                            System.out.print(stackArray[i] + " ");
                        }
                        System.out.println();
                    }
                }

                case 5 -> {
                    // Exit program
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }
}