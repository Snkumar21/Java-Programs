import java.util.Stack;

class postfix_to_prefix {
    
    // Function to convert postfix to prefix
    static String convertToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();
        
        // Process each character of the postfix expression
        for (char ch : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                // If operand, push it to stack as a string
                stack.push(String.valueOf(ch));
            } else {
                // If operator, pop two operands
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                // Concatenate operator and operands in prefix format
                String temp = ch + operand1 + operand2;
                stack.push(temp);
            }
        }
        
        return stack.peek();
    }

    public static void main(String[] args) {
        String postfix = "123*+";  // This is equivalent to the infix "1+2*3"
        String prefix = convertToPrefix(postfix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix: " + prefix);
        
        // Test with evaluation
        System.out.println("Evaluation Result: " + evaluatePrefix(prefix));
    }
    
    // Function to evaluate prefix expression
    static int evaluatePrefix(String prefix) {
        Stack<Integer> stack = new Stack<>();
        
        // Read from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (ch) {
                    case '+' -> stack.push(val1 + val2);
                    case '-' -> stack.push(val1 - val2);
                    case '*' -> stack.push(val1 * val2);
                    case '/' -> stack.push(val1 / val2);
                }
            }
        }
        return stack.pop();
    }
}