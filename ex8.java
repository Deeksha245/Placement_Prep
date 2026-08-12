//Leetcode problem 3
class ex8 { 
    // Made static so it can be called by lengthOfLongestSubstring
    public static boolean noDuplicates(String s, int start, int end) { 
        boolean existChar[] = new boolean[128]; 
        for(int i = start; i <= end; i++) { 
            char ch = s.charAt(i); 
            if(existChar[ch]) return false; 
            existChar[ch] = true; 
        } 
        return true; 
    } 

    // Moved outside of the main method and made static
    public static int lengthOfLongestSubstring(String s) { 
        int max = 0; 
        for(int i = 0; i < s.length(); i++){ 
            for(int j = i; j < s.length(); j++) { 
                if(noDuplicates(s, i, j)) {
                    max = Math.max(max, j - i + 1); 
                }
            } 
        } 
        return max; 
    } 

    public static void main(String[] args){ 
        String testStr = "abcabcbb";
        // Directly calling the static method
        int result = lengthOfLongestSubstring(testStr); 
        System.out.println("Length of longest substring without repeating characters: " + result);
    } 
}


/*s =
"abcabcbb"
Output
3
Expected
3*/