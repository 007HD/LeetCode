// Brute Force
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; 
        for(int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] == remaining) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

// Two-pass Hash Table

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);    
        }
        
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                int result[] = new int[] {i, map.get(complement)};
                return result;
            }
        }
        return null;
    }
}

// One-pass Hash Table
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}


