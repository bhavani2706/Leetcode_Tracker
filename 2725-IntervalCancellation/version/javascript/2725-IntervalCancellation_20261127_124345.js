// Last updated: 27/11/2026, 12:43:45
1/**
2 * @param {Function} fn
3 * @param {Array} args
4 * @param {number} t
5 * @return {Function}
6 */
7var cancellable=function(fn,args,t) {
8    fn(...args);
9    let timer=setInterval(()=>{
10        fn(...args);
11    },t);
12    return function(){
13        clearInterval(timer);
14    };
15};
16
17/**
18 *  const result = [];
19 *
20 *  const fn = (x) => x * 2;
21 *  const args = [4], t = 35, cancelTimeMs = 190;
22 *
23 *  const start = performance.now();
24 *
25 *  const log = (...argsArr) => {
26 *      const diff = Math.floor(performance.now() - start);
27 *      result.push({"time": diff, "returned": fn(...argsArr)});
28 *  }
29 *       
30 *  const cancel = cancellable(log, args, t);
31 *
32 *  setTimeout(cancel, cancelTimeMs);
33 *   
34 *  setTimeout(() => {
35 *      console.log(result); // [
36 *                           //     {"time":0,"returned":8},
37 *                           //     {"time":35,"returned":8},
38 *                           //     {"time":70,"returned":8},
39 *                           //     {"time":105,"returned":8},
40 *                           //     {"time":140,"returned":8},
41 *                           //     {"time":175,"returned":8}
42 *                           // ]
43 *  }, cancelTimeMs + t + 15)    
44 */