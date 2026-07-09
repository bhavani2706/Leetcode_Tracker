// Last updated: 09/07/2026, 10:04:53
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}