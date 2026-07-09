// Last updated: 09/07/2026, 10:03:06
class Solution {
    public boolean isPerfectSquare(int num) {
        int res=(int)Math.sqrt(num);
        if(res*res==num){
            return true;
        }
        return false;

    }
}