package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int longestIncreasingSubsequence(int nums[]) {
        int n = nums.length;
        int dp[][] = new int[n][n + 1];

        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, 0, -1, dp);
    }
    public int helper(int nums[], int currentIndex, int previousIndex, int dp[][]) {
        if (currentIndex == nums.length) return 0;
        if (dp[currentIndex][previousIndex + 1] != -1)
            return dp[currentIndex][previousIndex + 1];
        int take = 0;
        if (previousIndex == -1 || nums[currentIndex] > nums[previousIndex]) {
            take = 1 + helper(nums, currentIndex + 1, currentIndex, dp);
        }
        int skip = helper(nums, currentIndex + 1, previousIndex, dp);

        dp[currentIndex][previousIndex + 1] = Math.max(take, skip);
        return dp[currentIndex][previousIndex + 1];
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();

        int nums[] = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lis.longestIncreasingSubsequence(nums);

        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}
