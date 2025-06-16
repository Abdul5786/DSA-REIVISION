package Stack;


import java.util.Stack;

// asked amazon,apple,google
public class dailyTemperature
{
    public static int [] dailyTemperature(int temperatures[])
    {
          // bf for(int i= 0; i< tem.length;i++)
                  // for(int j=i+1;j<tem.length;j++)
                         // if(tem[i]<tem[j])
                             // int ans[i] =j-i
        // optimized using stack

        int res[] = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<temperatures.length;i++)
        {
            if(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i])
            {
                res[stack.peek()]=i-stack.pop();
            }

            else {
                stack.push(i);
            }
        }

        return res;
    }

    public static void main(String args[])
    {
        int[] arr = {73, 74, 75, 71, 69,72,76,73};
        int[] temperature = dailyTemperature(arr);

        for(int tem:temperature)
        {
            System.out.print(+tem);
        }
    }
}
