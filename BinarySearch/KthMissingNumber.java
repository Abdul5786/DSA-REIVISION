package BinarySearch;

public class KthMissingNumber
{
    // asked in google ,amazon,apple

    // brute force with O(N)
    // optimized sol 0(nlogn)


    public static int findKthMissingNumber(int nums[],int k)
    {

        int left=0;
        int right= nums.length-1;

        while(left<=right)
        {

            int mid= left+(right-left)/2;

            if(nums[mid]-(mid+1)<=k)
            {
                left=mid+1;
            }

            else {
                right=mid-1;
            }
        }

        return left+k;


    }
    public static  int findKthMissingNumberBruteForceSol(int nums[],int K)
    {
        int currentValue=1;
        int index=0;
        int missingCountNumber=0;

        while(missingCountNumber<K)
        {
            if(index<nums.length && nums[index]==currentValue)
            {
                index++;
            }

            else {

                  missingCountNumber++;
                  if(missingCountNumber==K)
                  {
                      return currentValue;
                  }
            }

            currentValue++;
        }

       return -1;
    }

    public static void main(String[] args)
    {
        int[] nums = {2, 3, 4, 7, 11};
        int K = 5;
        int result = findKthMissingNumber(nums, K);
        System.out.println("The " + K + "th missing number is: " + result);
        // Expected output: 9
    }


}
