package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams
{
    public static List<Integer> findAllAnagrams(String s, String p)
    {
        int pFreq[] = new int[26];
        int sFreq[] = new int[26];

        ArrayList<Integer> result = new ArrayList<>();

        for(char ch: p.toCharArray())
        {
            pFreq[ch-'a']++;
        }

        for(int i=0;i<s.length();i++)
        {
            sFreq[s.charAt(i)-'a']++;

            if(i>=p.length())
            {
                // shrink the window
                sFreq[s.charAt(i-p.length())-'a']--; // decrease thr frequency
            }
            if(Arrays.equals(sFreq,pFreq))
            {
                result.add(i-p.length()+1);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAllAnagrams(s, p);

        System.out.println("Anagram indices: " + ans);
    }
}
