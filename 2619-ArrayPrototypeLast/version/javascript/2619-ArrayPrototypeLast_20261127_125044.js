// Last updated: 27/11/2026, 12:50:44
1/**
2 * @return {null|boolean|number|string|Array|Object}
3 */
4Array.prototype.last=function() {
5    if(this.length===0) {
6        return -1;
7    }
8    return this[this.length - 1];
9};
10/**
11 * const arr = [1, 2, 3];
12 * arr.last(); // 3
13 */