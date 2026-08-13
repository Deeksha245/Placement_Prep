 Contains Duplicate II
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2// difference between the duplicate values must match k
Output: false
//This method strips away the negative sign and returns the non-negative .abs()  
/*import java.util.HashSet;
import java.util.Set;
// Syntax 1: Using standard HashSet reference
HashSet<String> names = new HashSet<>();
// Syntax 2: Using Set interface reference (Recommended/Best Practice)
Set<Integer> numbers = new HashSet<>();*/
	class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}

//Sirs implementation

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer ,Integer> map = new HashMap<>();   
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i]) <= k)
                return true;
            map.put(nums[i] ,i);// if previously elements is found in hash table and found duplicate ,earlier index number will be changed with new index
        }
        return false;
        
        
    }
}//Complexity O(1) (Hash set)

	
 
