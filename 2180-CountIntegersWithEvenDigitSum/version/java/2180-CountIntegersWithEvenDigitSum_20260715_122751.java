// Last updated: 15/07/2026, 12:27:51
1class Solution {
2    public int countOperations(int num1, int num2) {
3       int op=0;
4       while(num1!=0 && num2!=0){
5       if(num1>=num2){
6        num1=num1-num2;
7       }
8       else{
9        num2=num2-num1;
10       }
11       op++;
12    }
13    return op;
14    }
15}