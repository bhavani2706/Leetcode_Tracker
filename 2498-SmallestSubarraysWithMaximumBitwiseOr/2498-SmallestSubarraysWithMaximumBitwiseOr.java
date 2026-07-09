// Last updated: 09/07/2026, 10:00:34
class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] bitLastSeen = new int[32]; 
        for (int i = n - 1; i >= 0; i--) {
           for (int j = 0; j < 32; j++) {
                if ((nums[i] & (1 << j)) != 0) {
                    bitLastSeen[j] = i;
                }
            }
            int maxIndex = i;
            for (int j = 0; j < 32; j++) {
                maxIndex = Math.max(maxIndex, bitLastSeen[j]);
            }

            result[i] = maxIndex - i + 1;
        }

        return result;
    }
}
