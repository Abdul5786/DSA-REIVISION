package SlidingWindow;


import java.util.HashSet;

// Find K-Length Substrings With No Repeated Characters
//
//Given a string s and an integer k, return the number of substrings of length k with no repeated characters.
//
//Example 1:
//Input: s = "havefunonleetcode", k = 5
//Output: 6
//Explanation: Substrings are ["havef","avefu","vefun","efuno","etcod","tcode"]
public class NumKLenSubstrNoRepeats {
    public int numKLenSubstrNoRepeats(String s, int k) {
        int start = 0, max = 0, count = 0;

        HashSet<Character> set = new HashSet<>();
        for (int end = 0; end < s.length(); end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start++));  // window shrink
            }

            set.add(s.charAt(end));

            if (end - start + 1 == k) {
                count++;
                set.remove(s.charAt(start++));
            }


        }

        return count;
    }

    // ✅ Main method to test the function
    public static void main(String[] args) {
        NumKLenSubstrNoRepeats obj = new NumKLenSubstrNoRepeats();
        String s = "havefunonleetcode";
        int k = 5;

        int result = obj.numKLenSubstrNoRepeats(s, k);
        System.out.println("Number of substrings of length " + k + " with no repeated characters: " + result);
    }
}