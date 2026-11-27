// Last updated: 27/11/2026, 12:55:00
1/**
2 * @param {Array} arr1
3 * @param {Array} arr2
4 * @return {Array}
5 */
6var join = function(arr1, arr2) {
7    let result = {};
8    for (let i=0;i<arr1.length;i++) {
9        result[arr1[i].id]=arr1[i];
10    }
11    for (let i=0;i<arr2.length;i++) {
12        let id=arr2[i].id;
13        if(result[id]) {
14            result[id]={...result[id], ...arr2[i]};
15        } else {
16            result[id] = arr2[i];
17        }
18    }
19    return Object.values(result).sort((a, b) => a.id - b.id);
20};