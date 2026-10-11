// Last updated: 11/10/2026, 23:43:59
1/**
2 * @param {number[]} nums
3 * @return {number[]}
4 */
5var runningSum = function(nums) {
6    for(let i=1;i<nums.length;i++){
7        nums[i]=nums[i]+nums[i-1];
8    }
9    return nums;
10};