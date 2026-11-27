// Last updated: 27/11/2026, 12:45:58
1class TimeLimitedCache {
2    constructor() {
3        this.cache = new Map();
4    }
5
6    set(key, value, duration) {
7        let exists = this.cache.has(key);
8
9        if (exists) {
10            clearTimeout(this.cache.get(key).timer);
11        }
12
13        let timer = setTimeout(() => {
14            this.cache.delete(key);
15        }, duration);
16
17        this.cache.set(key, { value, timer });
18
19        return exists;
20    }
21
22    get(key) {
23        if (this.cache.has(key)) {
24            return this.cache.get(key).value;
25        }
26
27        return -1;
28    }
29
30    count() {
31        return this.cache.size;
32    }
33}
34/**
35 * const timeLimitedCache = new TimeLimitedCache()
36 * timeLimitedCache.set(1, 42, 1000); // false
37 * timeLimitedCache.get(1) // 42
38 * timeLimitedCache.count() // 1
39 */