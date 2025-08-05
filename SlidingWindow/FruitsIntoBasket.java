package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBasket
{
    static  int start=0,max=0;
    public static int maxFruitsInaBasket(int fruits[])
    {
        Map<Integer,Integer> basket = new HashMap<Integer,Integer>();
      for(int end =0;end<fruits.length;end++)
      {
          int fruit = fruits[end];
          basket.put(fruit,basket.getOrDefault(fruit,0)+1);
          while (basket.size()>2)
          {
              int leftFruits  = fruits[start];
              basket.put(leftFruits,basket.get(leftFruits)-1);
              if(basket.get(leftFruits)==0)
              {
                  basket.remove(leftFruits);
              }
              start++;
          }
          max =Math.max(max,end-start+1);
      }

      return max;
    }
    public static void main(String[] args) {
        int[] fruits = {1, 2, 1, 2, 3};  // Example input
        int result = maxFruitsInaBasket(fruits);
        System.out.println("Maximum fruits that can be picked: " + result);
    }
}
