package Arrays;

import java.util.HashMap;

public class TwoSum
{

    HashMap<Integer,Integer> res =  new HashMap<>();
    public int[] twoSum(int arr[],int target)
    {

        for(int i=0;i<arr.length;i++)
        {
            int compliment = target-arr[i];
            if(res.containsKey(compliment))
            {
                return new int[]{res.get(compliment),i};
            }

            res.put(arr[i],i);
        }

        return  new int[]{-1,-1};
    }

    public static void main(String[] args)
    {
        TwoSum obj = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = obj.twoSum(arr, target);

        for (int num: result)
        {
          System.out.println(num);
        }
    }
}
