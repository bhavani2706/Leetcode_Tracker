// Last updated: 09/07/2026, 10:00:13
class Solution {
    public int minimumSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = m * n; // initialize with a large upper bound

        // Try horizontal split into top + (left+right at bottom)
        for (int i = 0; i < m; ++i) {
            int top = minimumArea(grid, 0, i, 0, n - 1);
            for (int j = 0; j < n; ++j) {
                int left = minimumArea(grid, i + 1, m - 1, 0, j);
                int right = minimumArea(grid, i + 1, m - 1, j + 1, n - 1);
                ans = Math.min(ans, top + left + right);
            }
        }

        // Try horizontal split into (left+right at top) + bottom
        for (int i = 0; i < m; ++i) {
            int bottom = minimumArea(grid, i, m - 1, 0, n - 1);
            for (int j = 0; j < n; ++j) {
                int left = minimumArea(grid, 0, i - 1, 0, j);
                int right = minimumArea(grid, 0, i - 1, j + 1, n - 1);
                ans = Math.min(ans, bottom + left + right);
            }
        }

        // Try vertical split into left + (top+bottom on right)
        for (int j = 0; j < n; ++j) {
            int left = minimumArea(grid, 0, m - 1, 0, j);
            for (int i = 0; i < m; ++i) {
                int top = minimumArea(grid, 0, i, j + 1, n - 1);
                int bottom = minimumArea(grid, i + 1, m - 1, j + 1, n - 1);
                ans = Math.min(ans, left + top + bottom);
            }
        }

        // Try vertical split into (top+bottom on left) + right
        for (int j = 0; j < n; ++j) {
            int right = minimumArea(grid, 0, m - 1, j, n - 1);
            for (int i = 0; i < m; ++i) {
                int top = minimumArea(grid, 0, i, 0, j - 1);
                int bottom = minimumArea(grid, i + 1, m - 1, 0, j - 1);
                ans = Math.min(ans, right + top + bottom);
            }
        }

        // Try splitting by two horizontal cuts into three horizontal stripes
        for (int i1 = 0; i1 < m; ++i1)
            for (int i2 = i1 + 1; i2 < m; ++i2) {
                int area1 = minimumArea(grid, 0, i1, 0, n - 1);
                int area2 = minimumArea(grid, i1 + 1, i2, 0, n - 1);
                int area3 = minimumArea(grid, i2 + 1, m - 1, 0, n - 1);
                ans = Math.min(ans, area1 + area2 + area3);
            }

        // Try splitting by two vertical cuts into three vertical stripes
        for (int j1 = 0; j1 < n; ++j1)
            for (int j2 = j1 + 1; j2 < n; ++j2) {
                int area1 = minimumArea(grid, 0, m - 1, 0, j1);
                int area2 = minimumArea(grid, 0, m - 1, j1 + 1, j2);
                int area3 = minimumArea(grid, 0, m - 1, j2 + 1, n - 1);
                ans = Math.min(ans, area1 + area2 + area3);
            }

        return ans;
    }

    private int minimumArea(int[][] grid, int si, int ei, int sj, int ej) {
        int m = grid.length, n = grid[0].length;
        int x1 = m, y1 = n, x2 = -1, y2 = -1;

        for (int i = si; i <= ei; ++i) {
            for (int j = sj; j <= ej; ++j) {
                if (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] == 1) {
                    x1 = Math.min(x1, i);
                    y1 = Math.min(y1, j);
                    x2 = Math.max(x2, i);
                    y2 = Math.max(y2, j);
                }
            }
        }
        // If no '1' in this subgrid
        if (x2 == -1) return 0;
        // Otherwise compute area
        return (x2 - x1 + 1) * (y2 - y1 + 1);
    }
}
