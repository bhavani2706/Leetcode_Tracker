// Last updated: 27/11/2026, 12:56:17
1/**
2 * @param {Object|Array} obj
3 * @return {Object|Array}
4 */
5var compactObject = function(obj) {
6    if (Array.isArray(obj)) {
7        return obj.filter(Boolean).map(compactObject);
8    }
9    if (obj !== null && typeof obj === "object") {
10        let result = {};
11        for (let key in obj) {
12            if (obj[key]) {
13                result[key] = compactObject(obj[key]);
14            }
15        }
16        return result;
17    }
18    return obj;
19};