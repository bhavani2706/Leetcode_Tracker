// Last updated: 09/07/2026, 09:46:06
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        long bestDiag2 = -1;
        long bestArea = 0;

        for (int[] d : dimensions) {
            long a = d[0], b = d[1];
            long diag2 = a * a + b * b;   
            long area  = a * b;          
            if (diag2 > bestDiag2 || (diag2 == bestDiag2 && area > bestArea)) {
                bestDiag2 = diag2;
                bestArea = area;
            }
        }
        return (int) bestArea;
    }
}
