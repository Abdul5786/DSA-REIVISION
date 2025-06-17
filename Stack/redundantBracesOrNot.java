package Stack;

import java.util.Stack;

public class redundantBracesOrNot {

    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                boolean operatorFound = false;

                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        operatorFound = true;
                    }
                }

                stack.pop(); // remove '('
                if (!operatorFound) return true;
            } else {
                stack.push(ch);
            }
        }

        return false; // no redundant brackets found
    }

    public static void main(String[] args) {
        System.out.println(check("((a+b))"));        // true
        System.out.println(check("(a+(b)/c)"));      // true
        System.out.println(check("(a+b*(c-d))"));    // false
        System.out.println(check("(a)"));            // true
    }
}
