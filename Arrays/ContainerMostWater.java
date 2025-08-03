package Arrays;

public class ContainerMostWater
{
    public static int containerWithMostWater(int nums[])
    {
        int maxArea=Integer.MIN_VALUE;
        int left=0;
        int right=nums.length-1;
      while(left<right)
      {
          int currentArea =Math.min(nums[left],nums[right])*(right-left);
          maxArea =Math.max(currentArea,maxArea);
          if(nums[left]<nums[right])
          {
              left++;
          }
          else {
              right--;
          }
      }
      return maxArea;
    }
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(nums));
    }
}
