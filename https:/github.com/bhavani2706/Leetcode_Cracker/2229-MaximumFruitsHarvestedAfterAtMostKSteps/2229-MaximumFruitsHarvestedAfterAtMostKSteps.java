// Last updated: 09/07/2026, 09:46:45
class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int left = 0, maxFruits = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += fruits[right][1];
            while (left <= right && minSteps(fruits, left, right, startPos) > k) {
                sum -= fruits[left][1];
                left++;
            }

            maxFruits = Math.max(maxFruits, sum);
        }

        return maxFruits;
    }
    private int minSteps(int[][] fruits, int left, int right, int startPos) {
        int leftPos = fruits[left][0];
        int rightPos = fruits[right][0];

        if (rightPos <= startPos) {
            return startPos - leftPos;
        } else if (leftPos >= startPos) {
            return rightPos - startPos;
        } else {
            return Math.min(2 * (startPos - leftPos) + (rightPos - startPos),
                            2 * (rightPos - startPos) + (startPos - leftPos));
        }
    }
}
