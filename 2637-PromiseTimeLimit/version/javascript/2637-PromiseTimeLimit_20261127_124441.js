// Last updated: 27/11/2026, 12:44:41
1/**
2 * @param {Function} fn
3 * @param {number} t
4 * @return {Function}
5 */
6var timeLimit=function(fn, t) {
7    return async function(...args) {
8        return Promise.race([
9            fn(...args),
10            new Promise((_, reject) => {
11                setTimeout(() => reject("Time Limit Exceeded"), t);
12            })
13        ]);
14    };
15};
16
17/**
18 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
19 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
20 */