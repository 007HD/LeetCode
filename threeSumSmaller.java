class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        if(nums == null || nums.length < 3){
            return 0;
        }
        int n = nums.length;
        Arrays.sort(nums);
        int answer = 0;
        for(int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if(nums[i] + nums[j] + nums[k] >= target) {
                k--;
            }   else {
                answer+= (k - j);
                j++;        
                }
            
            }
            
        }
        return answer;
    }
}
