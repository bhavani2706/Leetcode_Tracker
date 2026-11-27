// Last updated: 27/11/2026, 12:47:43
1/**
2 * @param {Array<Function>} functions
3 * @return {Promise<any>}
4 */
5var promiseAll=function(functions) {
6    return new Promise((resolve, reject) => {
7        let result = [];
8        let count = 0;
9        if (functions.length === 0) {
10            resolve(result);
11        }
12        for (let i = 0; i < functions.length; i++) {
13            functions[i]()
14                .then(value => {
15                    result[i] = value;
16                    count++;
17                    if (count === functions.length) {
18                        resolve(result);
19                    }
20                })
21                .catch(reject);
22        }
23    });
24};;
25
26/**
27 * const promise = promiseAll([() => new Promise(res => res(42))])
28 * promise.then(console.log); // [42]
29 */