// Last updated: 27/11/2026, 12:37:27
1/**
2 * @param {Function} fn
3 * @return {Function}
4 */
5var once=function(fn) {
6    let called=false;
7
8    return function(...args){
9        if(!called){
10            called=true;
11            return fn(...args);
12        }
13    };
14};
15/**
16 * let fn = (a,b,c) => (a + b + c)
17 * let onceFn = once(fn)
18 *
19 * onceFn(1,2,3); // 6
20 * onceFn(2,3,6); // returns undefined without calling fn
21 */
22