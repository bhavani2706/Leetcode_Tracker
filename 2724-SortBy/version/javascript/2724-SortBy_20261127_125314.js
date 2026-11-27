// Last updated: 27/11/2026, 12:53:14
1/**
2 * @param {Array} arr
3 * @param {Function} fn
4 * @return {Array}
5 */
6var sortBy = function(arr, fn) {
7    return arr.sort((a, b) => fn(a) - fn(b));
8};