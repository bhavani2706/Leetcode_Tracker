// Last updated: 27/11/2026, 12:01:42
1/**
2 * @param {number[]} arr
3 * @param {Function} fn
4 * @return {number[]}
5 */
6var filter=function(arr, fn) {
7    let result = [];
8
9    for(let i=0;i<arr.length;i++) {
10        if(fn(arr[i],i)){
11            result.push(arr[i]);
12        }
13    }
14    return result;
15};