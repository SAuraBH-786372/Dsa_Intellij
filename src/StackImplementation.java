class StackArray {
    int[] arr;
    int top;

    // Constructor to initialize stack
    StackArray(int size) {
        arr = new int[size];
        top = -1;
    }

    // Push method
    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = x;
    }

    // Pop method
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Peek method
    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return arr[top];
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == -1;
    }

    // Print the stack (for testing)
    void printStack() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


public class StackImplementation {
    public static void main(String[] args) {
        StackArray st = new StackArray(5); // create stack of size 5
        st.push(10);
        st.push(20);
        st.push(30);
        st.printStack(); // 10 20 30

        System.out.println("Peek: " + st.peek()); // 30
        System.out.println("Popped: " + st.pop()); // 30
        System.out.println("Popped: " + st.pop()); // 20

        st.printStack(); // 10

        System.out.println("Is Empty? " + st.isEmpty());

        st.pop(); // removes 10
        st.pop(); // underflow
    }
}
