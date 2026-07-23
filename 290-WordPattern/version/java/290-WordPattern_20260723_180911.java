// Last updated: 23/07/2026, 18:09:11
1class Solution {
2    public boolean wordPattern(String pattern,String s) {
3        String[] words=s.split(" ");
4        if (pattern.length()!=words.length)
5         return false;
6        HashMap<Character,String> map=new HashMap<>();
7        for(int i=0;i<pattern.length();i++){
8        char ch=pattern.charAt(i);
9        if(map.containsKey(ch)){
10            if(!map.get(ch).equals(words[i])){
11             return false;
12            }
13        }
14        else{
15             if(map.containsValue(words[i])){
16                return false;
17             }
18            }
19
20        map.put(ch,words[i]);   
21        }
22        return true;
23    }
24}
25