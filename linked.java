// This is linked-list code of java using node functionality.
class First {
    int data;
    First next;

    public First(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomStack {
    private First top;

    public CustomStack() {
        this.top = null;
    }

    // Push method
    public void push(int data) {
        First newNode = new First(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed onto stack.");
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        System.out.println(poppedData + " popped from stack.");
        return poppedData;
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        First temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.display();
        System.out.println("Stack is empty? " + stack.isEmpty());
    }
}
