// Last updated: 09/07/2026, 10:00:00
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;

        for (int i = 0; i < fruits.length; i++) {
            int fruit = fruits[i];
            int placed = -1;

            for (int j = 0; j < baskets.length; j++) {
                if (baskets[j] >= fruit) {
                    placed = j;
                    break;
                }
            }

            if (placed == -1) {
                count++;
            } else {
                baskets[placed] = -1;
            }
        }

        return count; 
    }
}
