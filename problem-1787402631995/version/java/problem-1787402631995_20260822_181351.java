// Last updated: 22/08/2026, 18:13:51
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int sum=0;
4        int pro=1;
5       while(n>0){
6        int digit=n%10;
7        sum+=digit;
8        pro*=digit;
9        n/=10;
10       } 
11       int res=pro-sum;
12       return res;
13    }
14}