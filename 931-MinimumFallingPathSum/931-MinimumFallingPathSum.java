// Last updated: 23/10/2025, 2:02:59 pm
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length ;
        int dp[][] = new int[n][n];
        int mini = Integer.MAX_VALUE;
        for( int i=0 ; i<n ; i++) {
            dp[0][i] = matrix[0][i];
        }
        for( int i =1 ; i<n ;i++){
            for( int j = 0 ; j<n ; j++){

                int up = dp[i-1][j];
                int dialeft =0 ;

                if( j-1>=0) dialeft = dp[i-1][j-1];
                else dialeft+= 1e9;

                int diaright =0 ;

                if( j+1<n ) diaright = dp[i-1][j+1];
                else diaright+= 1e9 ;

                dp[i][j]=matrix[i][j] + Math.min(up,Math.min(dialeft, diaright));
            }
        }

        for( int i = 0 ; i<n ; i++){
            mini = Math.min( mini , dp[n-1][i]);
        }
        return mini;
    }
   
}