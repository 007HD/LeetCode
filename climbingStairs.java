class Solution {
    //Time Limit Exceeds
//     public int climbStairs(int n) {
//         if (n==0 || n==1) {
//             return 1;
//         } else {
//           return climbStairs(n-1) + climbStairs(n-2);  
//         } 
        
    // Dp
        public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int nums[] = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i-1] + nums[i-2];
        }   
        return nums[n];
    }
}
