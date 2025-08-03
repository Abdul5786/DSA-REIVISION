package Arrays;
import java.util.HashMap;
public class SubArraySumEqualToK
{
    public static int subArraySumEqualToK(int nums[], int k) {
        int count = 0, prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            // update krdenge map ko

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;

    }
    public static void main(String[] args)
    {
       int arr[] ={1,2,3};
        int result = subArraySumEqualToK(arr, 3);
        System.out.println(result);

    }
}
