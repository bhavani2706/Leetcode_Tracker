// Last updated: 27/11/2026, 12:59:21
1class Calculator {
2    constructor(value) {
3        this.value = value;
4    }
5    add(value) {
6        this.value += value;
7        return this;
8    }
9    subtract(value) {
10        this.value -= value;
11        return this;
12    }
13multiply(value) {
14        this.value *= value;
15        return this;
16    }
17    divide(value) {
18        if (value === 0) {
19            throw new Error("Division by zero is not allowed");
20        }
21
22        this.value /= value;
23        return this;
24    }
25    power(value) {
26        this.value **= value;
27        return this;
28    }
29    getResult() {
30        return this.value;
31    }
32}