// Last updated: 3/1/2026, 4:12:52 pm
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        int[][] dp = new int[n][m];
6        for (int[] row : dp) Arrays.fill(row, -1);
7        return helper(grid, dp, 0, 0);
8    }
9
10    public int helper(int[][] grid, int[][] dp, int row, int col) {
11        if (row >= grid.length || col >= grid[0].length)
12            return Integer.MAX_VALUE;
13
14        if (row == grid.length - 1 && col == grid[0].length - 1)
15            return grid[row][col];
16
17        if (dp[row][col] != -1)
18            return dp[row][col];
19
20        int down = helper(grid, dp, row + 1, col);
21        int right = helper(grid, dp, row, col + 1);
22
23        return dp[row][col] =
24            grid[row][col] + Math.min(down, right);
25    }
26}
27