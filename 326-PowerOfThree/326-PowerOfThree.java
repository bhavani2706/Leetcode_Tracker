// Last updated: 09/07/2026, 10:03:17
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==1)
                return true;
                 if(n%3!=0 || n<=0)
             return false;
        
            
            
            
        
        return isPowerOfThree(n/3);
    }
}