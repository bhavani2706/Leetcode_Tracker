// Last updated: 09/07/2026, 09:47:20
public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removeAndCount(s, "ab", x, y);
        } else {
            return removeAndCount(s, "ba", y, x);
        }
    }
 private int removeAndCount(String s, String first, int firstScore, int secondScore) {
        StringBuilder stack1 = new StringBuilder();
        int score = 0;
        for (char c : s.toCharArray()) {
            int len = stack1.length();
            if (len > 0 && stack1.charAt(len - 1) == first.charAt(0) && c == first.charAt(1)) {
                stack1.deleteCharAt(len - 1);  // Remove matching char
                score += firstScore;
            } else {
                stack1.append(c);
            }
        }
        StringBuilder stack2 = new StringBuilder();
        for (char c : stack1.toString().toCharArray()) {
            int len = stack2.length();
            if (len > 0 && stack2.charAt(len - 1) == first.charAt(1) && c == first.charAt(0)) {
                stack2.deleteCharAt(len - 1);
                score += secondScore;
            } else {
                stack2.append(c);
            }
        }

        return score;
    }
}
