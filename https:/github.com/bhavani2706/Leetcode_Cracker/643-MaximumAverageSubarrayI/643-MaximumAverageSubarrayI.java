// Last updated: 09/07/2026, 09:48:29
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1 && k==1){
            return(double)nums[0];
        }
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double maxavg=sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            double avg=sum/k;
            if(avg>maxavg){
                maxavg=avg;
            }
        }
        return maxavg;
    }
}