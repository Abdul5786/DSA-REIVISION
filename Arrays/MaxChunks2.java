package Arrays;

public class MaxChunks2
{
    public static  int maxChunksSecond(int nums[])
    {
        int n = nums.length;
        int leftMax [] = new int[n];
        int rightMin[] = new int[n+1];

        int chunks = 0;
        // Step 1: Fill leftMax
        leftMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], nums[i]);
        }
        // Step 2: Fill rightMin
        rightMin[n] = Integer.MAX_VALUE; //
        for (int i = n - 1; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], nums[i]);
        }
        // Step 3: Count valid chunks
        for (int i = 0; i < n; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                chunks++;
            }
        }
        return chunks;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 3, 4, 4};
        System.out.println(maxChunksSecond(nums)); // Output: 4
    }
}
