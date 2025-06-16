package Stack;


import java.util.Stack;

// asked in amazon ,mmt
public class reversedPolishNotation
{
    public static int evalRpn(String [] tokens)
    {
        Stack<Integer> stack = new Stack<>();
        for (String token:tokens)
        {
            if("+-/*".contains(token))
            {
                int b= stack.pop();
                int a=stack.pop();

                switch (token)
                {
                    case "+":stack.push(a+b);break;
                    case "-":stack.push(a-b);break;
                    case "*":stack.push(a*b);break;
                    case "/":stack.push(a/b);break;
                }
            }

            else {

                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"}; // (2 + 1) * 3 = 9
        int result = evalRpn(tokens);
        System.out.println("Result: " + result);
    }
}
