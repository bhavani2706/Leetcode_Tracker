// Last updated: 27/11/2026, 12:39:08
1/**
2 * @param {Function} fn
3 * @return {Function}
4 */
5var memoize=function(fn) {
6    let cache={};
7
8    return function(...args) {
9        let key=JSON.stringify(args);
10        if(key in cache) {
11            return cache[key];
12        }
13        let result=fn(...args);
14        cache[key]=result;
15        return result;
16    };
17};
18
19
20/** 
21 * let callCount = 0;
22 * const memoizedFn = memoize(function (a, b) {
23 *	 callCount += 1;
24 *   return a + b;
25 * })
26 * memoizedFn(2, 3) // 5
27 * memoizedFn(2, 3) // 5
28 * console.log(callCount) // 1 
29 */