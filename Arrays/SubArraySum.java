package Arrays;

public class SubArraySum
{
    // using kadne algo

    public int maxSubArraysSum(int nums[])
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {

           currentSum += nums[i];

           maxSum = Math.max(currentSum,maxSum);

           if(currentSum<0)
           {
               currentSum=0;
           }
        }
        return  maxSum;
    }

    public static void main(String[] args)
    {
        SubArraySum obj = new SubArraySum();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArraysSum(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Output: 6
    }
}
