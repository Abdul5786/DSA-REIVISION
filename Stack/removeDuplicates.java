package Stack;

import java.util.Stack;

// Leetcode 316 - Remove Duplicate Letters
// Asked in Google
// Example: Input: "cbacddcbc" → Output: "abc"
public class removeDuplicates {

    public static String removeDuplicates(String s) {
        int lastIndex[] = new int[26];
        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();

        // Store the last index of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Skip if already added to result
            if (visited[c - 'a']) continue;

            // Maintain lexicographical order and uniqueness
            while (!stack.isEmpty() && c < stack.peek() && lastIndex[stack.peek() - 'a'] > i) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            visited[c - 'a'] = true;
        }

        // Build result from stack
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : stack) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String input1 = "cbacddcbc";
        String input2 = "bcabc";
        String input3 = "cbacdcbc";

        System.out.println("Input: " + input1 + " → Output: " + removeDuplicates(input1));
        System.out.println("Input: " + input2 + " → Output: " + removeDuplicates(input2));
        System.out.println("Input: " + input3 + " → Output: " + removeDuplicates(input3));
    }
}
