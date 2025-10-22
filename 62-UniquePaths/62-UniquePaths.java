// Last updated: 22/10/2025, 9:39:01 pm
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        dp[0][0] = 1;

        for( int i =0 ; i< m ; i++){
            for( int j = 0 ; j<n ; j++){
                int left = 0 ; int right = 0 ;
                if( i==0 &j==0) dp[0][0]=1;
                else{
                    if( i>0) left = dp[i-1][j];
                    if( j>0) right = dp[i][j-1];
                    dp[i][j] = left+right;
                }
            }
        }
        return dp[m-1][n-1];
    }

    public int helper( int row ,int col , int m , int n , int[][] vis){
        if (row >= m || col >= n) return 0;

        if( row == m-1 && col== n-1) return 1 ;

        if (vis[row][col] != -1) return vis[row][col];
         
        
        int a = helper( row , col+1 , m , n , vis);
            
        int b = helper( row+1 , col , m , n , vis );
        return vis[row][col] = a+b ;
    }
}