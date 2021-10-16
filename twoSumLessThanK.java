class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return -1;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int j = n - 1;
        int i = 0;
        int max = -1;
        while(i < j) {
            int sum = nums[i] + nums[j];
            if(sum < k) {
                max = Math.max(max, sum); 
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
// Time Complexity O(nlogn)
// Space Complexity O(1)
