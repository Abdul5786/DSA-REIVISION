package Arrays;

public class MaxChunks
{

    public static int  maxChunks(int nums[] )
    {

        int count= 0 , max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);

            if(max==i)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[]= {4,3,2,1,0};

        System.out.println(maxChunks(nums));
    }

}
