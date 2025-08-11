package DynamicProgramming;

import java.util.Arrays;

// leetcode 91
// input: s = "12"
//
//Output: 2
//
//Explanation:
//
//"12" could be decoded as "AB" (1 2) or "L" (12).
public class DecodeWays
{
    public int decodeWays(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp, -1);
        return helper(s,0,dp);
    }

    public int helper(String s, int index, int dp[])
    {
        if(index==s.length()) return 1;  // valid path

        if(s.charAt(index)=='0') return 0; // invalid path

        if(dp[index]!=-1) return dp[index];

        int ways = helper(s,index+1,dp);

        if(index+1<s.length() && Integer.parseInt(s.substring(index,index+2))<=26) {
            ways += helper(s, index + 2, dp); // taking 2 digits at a time
            dp[index] = ways;

        }


        return ways;
    }

    // main method to test
    public static void main(String[] args) {
        DecodeWays obj = new DecodeWays();
        String input = "226";
        System.out.println("Number of ways to decode \"" + input + "\": " + obj.decodeWays(input));
    }
}
