class Solution {
    // Brute Force 
    //O(n) time
    //(n) space    
    // public int firstMissingPositive(int[] nums) {
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i = 0; i < nums.length; i++) {
    //         set.add(nums[i]);
    //     }
    //     for(int i = 1; i <= nums.length; i++) {
    //         if (!set.contains(i))
    //             return i;
    //     }
    //     return nums.length +1;
    // }
    public int firstMissingPositive(int[] nums) {
    // Base case
        if(nums == null || nums.length == 0)
            return 1;       
    //Step 1 - Get rid of negative and number greater than nums.length
        int n = nums.length;
        int containsOne = 0;
            for(int i = 0; i < n; i++) {
                if(nums[i] == 1) {
                    containsOne = 1;
                }else if(nums[i] <= 0 || nums[i] > n) {
                    nums[i] = 1;                    
                }
            }
        if(containsOne == 0) return 1;
    //Step 2 - Go to the current value and set the value to negative (putting it in hashSet)
        for(int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
                if(nums[index] > 0) 
                    nums[index] = -1 * nums[index];
        }
    // Step 3 Iterate through array, the first non negative value's index is the first missing positive
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0)
                return i + 1;
        }
    // [1, 2, 3] -> 4    
        return n + 1;
    // Time Complexity - O(n)
    // Space Complexity - O(1)
        
    }
    
}

