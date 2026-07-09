// Last updated: 09/07/2026, 09:46:05
class Solution {
    public long flowerGame(int n, int m) {
        long oddsInN = (n + 1L) / 2;        // number of odd x
        long evensInN = n / 2;             // number of even x
        long oddsInM = (m + 1L) / 2;        // number of odd y
        long evensInM = m / 2;              // number of even y

        return oddsInN * evensInM + evensInN * oddsInM;
    }
}
