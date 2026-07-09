// Last updated: 09/07/2026, 09:48:39
class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
 for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
               if (Character.isUpperCase(ch)) {
                count++;
            }
        }
 if (count == 0) {
            return true;           
        }
        else if (count == word.length()) {
            return true;           
        }
        else if (count == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;       
        }

        return false;
    }
}