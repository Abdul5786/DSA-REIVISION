package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    public static List<List<Integer>>  ThreeSum(int nums[])
    {

       List<List<Integer>> res = new ArrayList<>();
       Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {

            int left= i+1 , right= nums.length-1;

            if(i>0 && nums[i]==nums[i-1]) continue;

            while(left<right)
            {

                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                }

                while(left<right && nums[left]==nums[left+1]) left++;
                while(left<right && nums[right]==nums[right-1]) right--;

                left++;
                right--;

                if(sum<0)
                {
                    left++;
                }

                else {
                    right--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int nums[]={-1,-1,2,2,0};
        System.out.println( ThreeSum(nums));
    }
}
