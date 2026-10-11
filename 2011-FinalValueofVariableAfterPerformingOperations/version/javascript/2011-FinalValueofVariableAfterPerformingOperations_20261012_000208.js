// Last updated: 12/10/2026, 00:02:08
1/**
2 * @param {string[]} operations
3 * @return {number}
4 */
5var finalValueAfterOperations=function(operations){
6    let sum=0;
7
8    for(let i=0;i<operations.length;i++){
9        if(operations[i]==="++X" || operations[i]==="X++"){
10            sum++;
11        } 
12        else{
13            sum--;
14        }
15    }
16  return sum;
17}; 
18