// Last updated: 09/07/2026, 09:47:41
class Solution {
    public int findNumbers(int[] nums) {
        int newcount=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
              int count=0;
            int temp=nums[i];
           while(temp>0){
            int digits=temp%10;
            count++;
            temp/=10;
            
        }
       if(count%2==0){
         newcount++;
       }

        }
        return newcount;
    }
}