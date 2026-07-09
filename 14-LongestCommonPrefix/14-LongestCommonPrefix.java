// Last updated: 09/07/2026, 10:05:01
class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        StringBuilder sub=new StringBuilder();
        String first=str[0];
        String last=str[str.length-1];
        for(int i=0;i<first.length() && i<last.length();i++){
       if(first.charAt(i)==last.charAt(i)){
            sub.append(last.charAt(i));
       }
       else{
        break;
       }
        }
    
            return sub.toString();

            
        
    }
}