package Stack;

import java.util.Stack;

public class DesignMinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // ✅ Sahi constructor
    public DesignMinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    // ✅ main method to test
    public static void main(String[] args) {
        DesignMinStack minStack = new DesignMinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        System.out.println("Min: " + minStack.getMin()); // 3

        minStack.pop(); // remove 7
        System.out.println("Min: " + minStack.getMin()); // 3

        minStack.pop(); // remove 3
        System.out.println("Min: " + minStack.getMin()); // 5

        System.out.println("Top: " + minStack.top());    // 5
    }
}
