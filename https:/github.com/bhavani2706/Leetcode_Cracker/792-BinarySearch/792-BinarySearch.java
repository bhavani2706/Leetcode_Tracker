// Last updated: 09/07/2026, 09:48:14
class Solution {
    public int search(int[] nums, int target) {
           int s=0,e=nums.length-1;
        int m=0;
        while(s<=e){
            m=s+(e-s)/2;
            if(nums[m]==target){
                return m;
            }
            if(target>nums[m])
            s=m+1;
            else 
            e=m-1;
            
        }return -1;
    }
}