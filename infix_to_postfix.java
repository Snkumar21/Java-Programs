import java.util.Stack;

public class infix_to_postfix {
    
    // Function to determine operator precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+', '-' -> {
                return 1;
            }
            case '*', '/' -> {
                return 2;
            }
            case '^' -> {
                return 3;
            }
        }
        return -1;
    }

    // Function to convert infix to postfix
    static String convertToPostfix(String infix) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : infix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    // Function to evaluate postfix expression
    static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');  // Convert character to integer
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (ch) {
                    case '+' -> stack.push(val1 + val2);
                    case '-' -> stack.push(val1 - val2);
                    case '*' -> stack.push(val1 * val2);
                    case '/' -> stack.push(val1 / val2);
                }
            }
        }
        return stack.pop();  // Final result
    }

    public static void main(String[] args) {
        String infix = "1+2*3";  // Input as String (not Integer)
        
        String postfix = convertToPostfix(infix);
        System.out.println("Postfix: " + postfix);

        int result = evaluatePostfix(postfix);
        System.out.println("Evaluation Result: " + result);
    }
}