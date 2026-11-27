// Last updated: 27/11/2026, 11:56:56
1var expect=function(val) {
2    return{
3        toBe:function(value) {
4            if(val===value) {
5                return true;
6            }
7            throw new Error("Not Equal");
8        },
9        notToBe:function(value) {
10            if(val!==value) {
11                return true;
12            }
13            throw new Error("Equal");
14        }
15    };
16};