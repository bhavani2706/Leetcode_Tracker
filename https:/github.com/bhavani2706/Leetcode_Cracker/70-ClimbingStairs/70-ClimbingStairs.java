// Last updated: 09/07/2026, 09:50:45
class Solution {
    public int climbStairs(int n) {
        if(n<=1){
            return n;
        }
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;

        
    }
}