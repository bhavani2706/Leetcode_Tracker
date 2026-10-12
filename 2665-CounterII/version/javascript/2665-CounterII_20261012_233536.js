// Last updated: 12/10/2026, 23:35:36
1/**
2 * @param {integer} init
3 * @return { increment: Function, decrement: Function, reset: Function }
4 */
5
6var createCounter=function(init) {
7    let count=init;
8    return{
9        increment:()=> ++count,
10        decrement:()=> --count,
11        reset:()=> count=init
12    };
13};
14
15
16/**
17 * const counter = createCounter(5)
18 * counter.increment(); // 6
19 * counter.reset(); // 5
20 * counter.decrement(); // 4
21 */