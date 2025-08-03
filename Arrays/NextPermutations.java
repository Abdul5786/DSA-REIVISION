package Arrays;

import java.util.Arrays;

public class NextPermutations
{
    public void nextPermutations(int nums[])
    {
        int i= nums.length-2;

        // finding pivot

        while (i>=0 && nums[i]>nums[i+1]) i--;

        if(i>0)  // if pivot exist
        {
            int j= nums.length-1;
            while(nums[i]>nums[j]) j--;

            swap(nums,i,j);
        }

        reverse(nums,i+1);
    }

    public void swap(int nums[],int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
    }

    public void reverse(int nums[],int start)
    {
        int end = nums.length-1;

        while(start<end)
        {
            swap(nums,start,end);
            start++;
            end--;
        }

    }

    public static void main(String[] args)
    {
        NextPermutations obj = new NextPermutations();

        int[] nums = {1, 2, 3}; // test input
        obj.nextPermutations(nums);

        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}
