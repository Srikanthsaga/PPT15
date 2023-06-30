import java.util.LinkedList;
import java.util.Queue;

public class PPT153 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public PPT153() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        int poppedElement = q1.remove();
        swapQueues();
        return poppedElement;
    }

    private void swapQueues() {
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public static void main(String[] args) {
        PPT153 stack = new PPT153();

        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());

        stack.push(4);
        System.out.println(stack.pop());
    }
}
