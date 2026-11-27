// Last updated: 27/11/2026, 12:46:43
1/**
2 * @param {Function} fn
3 * @param {number} t milliseconds
4 * @return {Function}
5 */
6var debounce=function(fn, t) {
7    let timer;
8    return function(...args) {
9        clearTimeout(timer);
10        timer=setTimeout(() => {
11            fn(...args);
12        }, t);
13    };
14};
15/**
16 * const log = debounce(console.log, 100);
17 * log('Hello'); // cancelled
18 * log('Hello'); // cancelled
19 * log('Hello'); // Logged at t=100ms
20 */