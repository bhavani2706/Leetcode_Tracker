// Last updated: 27/11/2026, 12:07:58
1/**
2 * @param {Function[]} functions
3 * @return {Function}
4 */
5var compose=function(functions) {
6    return function(x) {
7        for(let i=functions.length-1;i>=0;i--) {
8            x=functions[i](x);
9        }
10        return x;
11    };
12};
13/**
14 * const fn = compose([x => x + 1, x => 2 * x])
15 * fn(4) // 9
16 */