import java.util.Stack;

public class PPT155 {
    public static String reverseString(String S) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : S.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();

        // Pop characters from the stack and append to reversedString
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String S = "GeeksforGeeks";
        System.out.println("Original string: " + S);
        String reversedString = reverseString(S);
        System.out.println("Reversed string: " + reversedString);
    }
}
