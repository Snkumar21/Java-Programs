import java.util.Stack;

public class infixToPostfix {

    // Function to define operator precedence
    private static int precedence (char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        }; // Exponent has the highest precedence
    }

    // Function to convert infix expression to postfix
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // If operand, add it to output
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } 
            // If '(', push to stack
            else if (ch == '(') {
                stack.push(ch);
            } 
            // If ')', pop from stack until '(' is found
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } 
            // If operator, pop from stack based on precedence
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop all remaining operators from stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Main function to test the conversion
    public static void main(String[] args) {
        String infix = "A+(B*C-(D/E^F)*G)*H";
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }
}