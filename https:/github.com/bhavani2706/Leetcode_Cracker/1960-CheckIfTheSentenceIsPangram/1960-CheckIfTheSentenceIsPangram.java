// Last updated: 09/07/2026, 09:47:08
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
       for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }

        return set.size() == 26;
    }
}
