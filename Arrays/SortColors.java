package Arrays;

public class SortColors
{
    public static  void sortColors(int nums[])
    {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                mid++;
                low++;
            }

            else if(nums[mid]==1)
            {
                mid++;
            }

            else {

                swap(nums,mid,high);
                high--;
            }
        }
    }

    public static  void swap(int nums[],int a,int b)
    {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public static void main(String[] args) {
        int nums[]={1,1,1,2,2,2,0,0,0};
        sortColors(nums);
        for (int n:nums)
        {
            System.out.println(n);
        }
    }
}
