package BinarySearch;

public class SearchInRotatedSortedArray {

    public static int searchInRotatedSortedArray(int nums[], int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left part is sorted
            if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            // Right part is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String args[]) {
        int[] arr = {5, 6, 7, 0, 1, 2, 3, 4};
        int target = 3;

        int index = searchInRotatedSortedArray(arr, target);
        System.out.println("Index of " + target + ": " + index);
    }
}
