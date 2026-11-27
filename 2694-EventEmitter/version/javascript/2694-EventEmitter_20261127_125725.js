// Last updated: 27/11/2026, 12:57:25
1class EventEmitter {
2    constructor() {
3        this.events = {};
4    }
5    subscribe(eventName, callback) {
6        if (!this.events[eventName]) {
7            this.events[eventName] = [];
8        }
9        this.events[eventName].push(callback);
10        return {
11            unsubscribe: () => {
12                this.events[eventName] = this.events[eventName].filter(x => x !== callback);
13            }
14        };
15    }
16    emit(eventName, args = []) {
17        if (!this.events[eventName]) {
18            return [];
19        }
20        let result = [];
21
22        for (let i = 0; i < this.events[eventName].length; i++) {
23            result.push(this.events[eventName][i](...args));
24        }
25        return result;
26    }
27}
28/**
29 * const emitter = new EventEmitter();
30 *
31 * // Subscribe to the onClick event with onClickCallback
32 * function onClickCallback() { return 99 }
33 * const sub = emitter.subscribe('onClick', onClickCallback);
34 *
35 * emitter.emit('onClick'); // [99]
36 * sub.unsubscribe(); // undefined
37 * emitter.emit('onClick'); // []
38 */