// Last updated: 09/07/2026, 10:01:47
 class Solution {
    public int minSteps(String s, String t) {
        if (s.length() != t.length()) {
            return -1;
        }

        int[] sCount = new int[26];
        int[] tCount = new int[26];

        for (char c : s.toCharArray()) {
            sCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            tCount[c - 'a']++;
        }

        int steps = 0;
        for (int i = 0; i < 26; i++) {
            if (sCount[i] > tCount[i]) {
                steps += sCount[i] - tCount[i];
            }
        }

        return steps;
    }
}