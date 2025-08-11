package DynamicProgramming;

import java.util.Arrays;

public class ClimBingStairs
{
    public int climBingStairs(int n)
    {
        if(n<=2) return n;

        int ans[] = new int[n + 1];
        ans[1]=1;
        ans[2]=2;

        for(int i=3;i<n;i++)
        {
            ans[i] = ans[i-1]+ans[i-2];
        }
        return ans[n];
    }

    // memoization
//    public int climBing(int n)
//    {
//        int dp[] = new int[n];
//        Arrays.fill(dp,-1);
//        return helper(n,dp);
//
//    }
//
//    public int helper(int n,int dp[])
//    {
//        if(n<=1) return 1;
//        if(dp[n]!=-1) return dp[n];
//        dp[n] = helper(n-1,dp)+helper(n-1,dp);
//        return dp[n];
//    }
}
