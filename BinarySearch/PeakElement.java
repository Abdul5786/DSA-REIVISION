package BinarySearch;

public class PeakElement
{
    public static int findPeakElement(int nums[])
    {
        int n=nums.length;

        if (n == 1) return 0;

        if (n == 2) return nums[0] > nums[1] ? 0 : 1;


        if(nums[0]>nums[1])
        {
            return 0;
        }

        if(nums[n-1]>nums[n-2])
        {
            return n-1;
        }

        int start = 1;
        int end=n-2;

        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[mid+1]&& nums[mid]>nums[mid-1])
            {
                return mid;
            }
            else if (nums[mid]<nums[mid+1])
            {
                start=mid+1;
            }

            else {
                end=mid-1;
            }


        }

        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak found at index: " + peakIndex + " with value: " + arr[peakIndex]);
    }
}
