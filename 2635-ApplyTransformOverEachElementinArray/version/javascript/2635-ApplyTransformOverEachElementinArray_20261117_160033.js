// Last updated: 17/11/2026, 16:00:33
1/**
2 * @param {number[]} arr
3 * @param {Function} fn
4 * @return {number[]}
5 */
6var map=function(arr,fn) {
7    let result=[];
8for(let i=0;i<arr.length;i++) {
9        result.push(fn(arr[i],i));
10    }
11    return result;
12};