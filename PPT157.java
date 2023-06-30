import java.util.Stack;

public class PPT157 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public PPT157() {
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
        int poppedValue = stack.pop();
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        PPT157 minStack = new PPT157();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        System.out.println("Minimum element: " + minStack.getMin()); // -3

        minStack.pop();

        System.out.println("Top element: " + minStack.top()); // 0

        System.out.println("Minimum element: " + minStack.getMin()); // -2
    }
}
