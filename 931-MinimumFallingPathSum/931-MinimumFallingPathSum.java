// Last updated: 23/10/2025, 1:49:28 pm
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length ;
        int dp[][] = new int[n][n];
        int mini = Integer.MAX_VALUE;
        for( int ele[] : dp ) Arrays.fill( ele , -101);
        for( int i =0 ; i<n ;i++){
            
            int x = helper( n-1 , i , matrix , dp );
            mini = Math.min( mini , x );
        }
        return mini;
    }
    private int helper(int i, int j, int[][] grid, int[][] dp) {

        if (i<0||j<0||i>=grid.length || j>=grid.length) return Integer.MAX_VALUE; 
        if (i == 0 ) return grid[0][j];
        if (dp[i][j] != -101) return dp[i][j];

        int up = helper(i-1, j, grid, dp);
        int dialeft = helper(i-1, j-1, grid, dp);
        int diaright = helper( i-1, j+1 , grid , dp );

        return dp[i][j]=grid[i][j] + Math.min(up,Math.min(dialeft, diaright));
    }
}