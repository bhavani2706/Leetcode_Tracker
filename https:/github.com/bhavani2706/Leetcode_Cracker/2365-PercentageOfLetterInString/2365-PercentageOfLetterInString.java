// Last updated: 09/07/2026, 09:46:40
class Solution {
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return (count * 100) / s.length();
    }
}