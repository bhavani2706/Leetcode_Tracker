// Last updated: 09/07/2026, 10:00:10
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            if ((i - k < 0 || nums[i] > nums[i - k]) &&
                (i + k >= nums.length || nums[i] > nums[i + k]))
                sum += nums[i];
        return sum;
    }
}