// Last updated: 27/11/2026, 12:58:20
1/**
2 * @param {number[]} nums
3 * @return {void}
4 */
5class ArrayWrapper {
6    constructor(nums) {
7        this.nums = nums;
8    }
9    valueOf() {
10        let sum = 0;
11        for (let i = 0; i < this.nums.length; i++) {
12            sum += this.nums[i];
13        }
14        return sum;
15    }
16    toString() {
17        return JSON.stringify(this.nums);
18    }
19}
20
21/**
22 * const obj1 = new ArrayWrapper([1,2]);
23 * const obj2 = new ArrayWrapper([3,4]);
24 * obj1 + obj2; // 10
25 * String(obj1); // "[1,2]"
26 * String(obj2); // "[3,4]"
27 */