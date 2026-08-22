// Last updated: 22/08/2026, 18:11:13
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp=n;
4        int sum=0;
5        int pro=1;
6       while(n>0){
7        int digit=n%10;
8          sum+=digit;
9          pro*=digit;
10       n/=10;
11       } 
12       int res=sum+pro;
13       if(temp%res==0){
14        return true;
15       }
16      
17        return false;
18       
19    }
20}