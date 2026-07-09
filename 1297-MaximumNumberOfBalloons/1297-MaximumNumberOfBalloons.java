// Last updated: 09/07/2026, 10:01:59
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        for(char ch:text.toCharArray()){
        if(ch=='b')b++;
        else if(ch=='a')a++;
        else if(ch=='l')l++;
        else if(ch=='o')o++;
        else if(ch=='n')n++;
        }
        int ans = Math.min(
                    Math.min(b, a),
                    Math.min(l / 2, Math.min(o / 2, n))
                 );
                 return ans;
    }
}