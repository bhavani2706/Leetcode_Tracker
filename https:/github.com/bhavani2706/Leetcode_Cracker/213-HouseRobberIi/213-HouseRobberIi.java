// Last updated: 09/07/2026, 09:49:31
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int case1 = robLinear(nums, 0, nums.length - 2);
        int case2 = robLinear(nums, 1, nums.length - 1);
        
        return Math.max(case1, case2);
    }
    
    private int robLinear(int[] nums, int start, int end) {
        int prev1 = 0; 
        int prev2 = 0;
        
        for (int i = start; i <= end; i++) {
            int tmp = prev1;
            prev1 = Math.max(prev1, prev2 + nums[i]);
            prev2 = tmp;
        }
        
        return prev1;
    }
}
