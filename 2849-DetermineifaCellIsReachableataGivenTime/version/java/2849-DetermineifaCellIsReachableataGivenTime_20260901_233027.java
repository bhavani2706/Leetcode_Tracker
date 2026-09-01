// Last updated: 01/09/2026, 23:30:27
1class Solution {
2    public int averageValue(int[] nums) {
3        int sum=0;
4        int count=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]%3==0 && nums[i]%2==0){
7                sum+=nums[i];
8                count++;
9            }
10        }
11        if(count==0){
12          return 0;
13        }
14        
15        return sum/count;
16    }
17}