// Last updated: 01/09/2026, 23:17:42
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int num1=0;
4        int num2=0;
5        for(int i=1;i<=n;i++){
6            if(i%m!=0){
7                num1+=i;
8            }
9            else if(i%m==0){
10              num2+=i;
11            }
12        }
13        return num1-num2;
14    }
15}