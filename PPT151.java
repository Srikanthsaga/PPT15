import java.util.Arrays;
import java.util.Stack;

public class PPT151 {
    public static int[] findNextGreaterElements(int N, int[] arr) {
        int[] output = new int[N];
        Arrays.fill(output, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                output[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        return output;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = {1, 3, 2, 4};
        int[] result = findNextGreaterElements(N, arr);
        System.out.println(Arrays.toString(result));
    }
}
