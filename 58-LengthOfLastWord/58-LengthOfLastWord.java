// Last updated: 09/07/2026, 10:04:35
class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String last=str[str.length-1];
        return last.length();
    }
}