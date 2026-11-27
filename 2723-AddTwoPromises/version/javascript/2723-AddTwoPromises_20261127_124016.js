// Last updated: 27/11/2026, 12:40:16
1/**
2 * @param {Promise} promise1
3 * @param {Promise} promise2
4 * @return {Promise}
5 */
6var addTwoPromises = async function(promise1, promise2) {
7     let a=await promise1;
8    let b=await promise2;
9     return a + b;
10};
11
12/**
13 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
14 *   .then(console.log); // 4
15 */