package SlidingWindow;


import java.util.HashMap;

// Longest Substring with K Uniques
//  You are given a string s consisting only lowercase alphabets and an integer k.
//  Your task is to find the length of the longest substring that contains exactly k distinct characters.
//Input: s = "aabacbebebe", k = 3
//Output: 7
public class longestKSubstr
{
    public int longestKsubStringK(String s,int k)
    {
        int start=0, max=-1;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int end=0;end<s.length();end++)
        {
            char ch = s.charAt(end);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.size()>k)
            {
                char leftChar = s.charAt(start);
                map.put(leftChar,map.get(leftChar)-1);
                if(map.get(leftChar)==0)
                {
                    map.remove(leftChar); // shrink the window;
                }

                start++;
            }

            if(map.size()==k)
            {
                max = Math.max(max,end-start+1);
            }
        }

       return max;
    }

    // ✅ Main method for testing
    public static void main(String[] args) {
        longestKSubstr obj = new longestKSubstr();
        String s = "aabacbebebe";
        int k = 3;

        int result = obj.longestKsubStringK(s, k);
        System.out.println("Longest substring with exactly " + k + " unique characters: " + result);
    }
}
