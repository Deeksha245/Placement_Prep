class Solution {
    public int[] twoSum(int[] nums, int target) { // target=9 if nums[i]+nums[j]
        for(int i=0; i<nums.length ; i++){
            for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j] == target)
                return new int[] {i,j};// creation of array assigning values
               }
    }   return new int[] {};//if it has empty set it this returns value
}
}//Time complexity is n(2)

/*Use Hash map whenever data is being stored in relation we use map type
https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
functional programing in java consumer,supplier,predicate 
//boolean	containsKey(Object key)	


Returns true if this map contains a mapping for the specified key.
boolean	containsValue(Object value)	
Returns true if this map maps one or more keys to the specified value. most efficient*/
//Second approach to improve efficiency of the progrmam

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        for(int i=0; i<nums.length;i++){
             int complement =target-nums[i];
             if(map.containsKey(complement) && map.get(complement) !=i)
                return new int[] {i,map.get(complement)};

        }
        return new int[]{};
        
    }
}
//time complexity O(1)
