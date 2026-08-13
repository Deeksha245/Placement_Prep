/*242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.*/


 class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())// if length of both strings are different returns false
        {
            return false;

        }
        int [] counts = new int[26];// creates an array to store 26 letters
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;//if char at s [i] fount in t[i] then s will be incremented whereas t decrement
        }
        
        for(int count:counts)
        {
            if(count !=0)
            {
                return false;
            }
        }
        return true;


        
        
    }
}
