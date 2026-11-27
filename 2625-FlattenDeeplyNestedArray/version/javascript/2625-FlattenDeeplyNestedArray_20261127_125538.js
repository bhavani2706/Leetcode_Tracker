// Last updated: 27/11/2026, 12:55:38
1/**
2 * @param {Array} arr
3 * @param {number} depth
4 * @return {Array}
5 */
6var flat=function(arr, n) {
7    let result = [];
8    function flatten(arr, n) {
9        for (let i = 0; i < arr.length; i++) {
10            if (Array.isArray(arr[i]) && n > 0) {
11                flatten(arr[i], n - 1);
12            } else {
13                result.push(arr[i]);
14            }
15        }
16    }
17    flatten(arr, n);
18    return result;
19};