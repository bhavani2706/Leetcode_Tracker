// Last updated: 17/11/2026, 15:58:53
1/**
2 * @param {number[]} nums
3 * @param {Function} fn
4 * @param {number} init
5 * @return {number}
6 */
7var reduce=function(nums,fn,init) {
8    let result=init;
9    for(let i=0;i<nums.length;i++) {
10        result=fn(result,nums[i]);
11    }
12return result;
13};