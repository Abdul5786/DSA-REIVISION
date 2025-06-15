package SlidingWindow;

// LeetCode 209 - Minimum Size Subarray Sum
public class minimumSubarraySum {

    public static int minimumSubarray(int nums[], int target) {
        int start = 0, minLen = Integer.MAX_VALUE, sum = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int result = minimumSubarray(nums, target);
        System.out.println("Minimum length of subarray: " + result);
    }
}
