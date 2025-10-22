// Last updated: 22/10/2025, 10:27:55 pm
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        // return helper( m-1 , n-1 ,obstacleGrid );
        if (obstacleGrid[0][0] == 1) return 0;
        int dp[][] = new int[m][n];
        int mod = (int)(1e+7);
        for( int i = 0 ; i< m ; i++){
            for( int j = 0 ; j<n ; j++){
                if( i==0 && j==0 ) dp[i][j] =1 ;
                else if( obstacleGrid[i][j]==1) dp[i][j]=0 ;
                
                else {
                    int left = 0 , right = 0 ;
                    if( i>0 ) left = dp[i-1][j];
                    if( j>0 ) right = dp[i][j-1];
                    dp[i][j] = (left+right);
                }
                
            }
        }
        return dp[m-1][n-1];
    }

    public int helper( int row ,  int col , int[][] arr ){
        if( row<0 || col<0) return 0 ;

        if( row==0 && col==0 ) return 1 ;

        if( arr[row][col] == 1) return 0 ;

        return helper( row-1 , col , arr)+ helper( row, col-1 , arr );
    }
}