// Last updated: 27/11/2026, 12:51:54
1/**
2 * @param {Function} fn
3 * @return {Object}
4 */
5Array.prototype.groupBy=function(fn) {
6    let result={};
7    for(let i=0;i<this.length;i++) {
8        let key=fn(this[i]);
9        if (!result[key]) {
10            result[key] = [];
11        }
12    result[key].push(this[i]);
13    }
14    return result;
15};
16/**
17 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
18 */