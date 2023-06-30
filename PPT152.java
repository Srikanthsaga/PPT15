import java.util.Arrays;
import java.util.Stack;

public class PPT152 {
    public static int[] findNearestSmallerElements(int n, int[] a) {
        int[] output = new int[n];
        Arrays.fill(output, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[i] < a[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                output[i] = a[stack.peek()];
            }
            stack.push(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] a = {1, 6, 2};
        int[] result = findNearestSmallerElements(n, a);
        System.out.println(Arrays.toString(result));
    }
}
