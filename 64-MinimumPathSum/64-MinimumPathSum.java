// Last updated: 23/10/2025, 11:42:06 am
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        // for (int[] row : dp) Arrays.fill(row, -1);
        // return helper(m - 1, n - 1, grid, dp);

        for( int i = 0 ; i<m ;i++){
            for( int j =0 ; j<n ;j++){
                if( i==0 && j==0 ) dp[i][j]=grid[i][j];
                else{
                    int up = grid[i][j] , left = grid[i][j] ;
                    if( i>0) up+= dp[i-1][j];
                    else up+= 1e9;
                    if( j>0) left+= dp[i][j-1];
                    else left+= 1e9;

                    dp[i][j] = Math.min( up, left);
                }
            }
        }
        return dp[m-1][n-1];
    }

    private int helper(int i, int j, int[][] grid, int[][] dp) {
        if (i < 0 || j < 0) return Integer.MAX_VALUE; 
        if (i == 0 && j == 0) return grid[0][0];
        if (dp[i][j] != -1) return dp[i][j];

        int up = helper(i - 1, j, grid, dp);
        int left = helper(i, j - 1, grid, dp);

        return dp[i][j] = grid[i][j] + Math.min(up, left);
    }
}
