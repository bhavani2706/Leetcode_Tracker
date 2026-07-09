// Last updated: 09/07/2026, 09:47:40
class Solution {
    public int maximum69Number (int num) {
        String s=String .valueOf(num);
        s=s.replaceFirst("6","9");
        return Integer.parseInt(s);
        
    }
}