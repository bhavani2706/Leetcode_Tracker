// Last updated: 09/07/2026, 10:00:45
class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
                String triplet = num.substring(i - 2, i + 1);
                if (ans.isEmpty() || triplet.compareTo(ans) > 0) {
                    ans = triplet;
                }
            }
        }
        return ans;
    }
}
