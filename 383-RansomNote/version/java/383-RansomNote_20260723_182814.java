// Last updated: 23/07/2026, 18:28:14
1class Solution {
2    public boolean canConstruct(String r, String m) {
3          boolean[] used=new boolean[m.length()];
4          for(int i=0;i<r.length();i++){
5            boolean found=false;
6            for(int j=0;j<m.length();j++){
7                if(!used[j] && r.charAt(i)==m.charAt(j)){
8                    used[j]=true;
9                    found=true;
10                    break;
11                }
12            }
13            if(!found){
14                return false;
15            }
16          
17
18        }
19        return true;
20    }
21}