// Last updated: 23/10/2025, 2:04:53 pm
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length ;
        int dp[] = new int[n];

        int mini = Integer.MAX_VALUE;
        for( int i=0 ; i<n ; i++) {
            dp[i] = matrix[0][i];
        }
        for( int i =1 ; i<n ;i++){
            int curr[] = new int[n];
            for( int j = 0 ; j<n ; j++){

                int up = dp[j];
                int dialeft =0 ;

                if( j-1>=0) dialeft = dp[j-1];
                else dialeft+= 1e9;

                int diaright =0 ;

                if( j+1<n ) diaright = dp[j+1];
                else diaright+= 1e9 ;

                curr[j]=matrix[i][j] + Math.min(up,Math.min(dialeft, diaright));
            }
            dp = curr;
        }

        for( int i = 0 ; i<n ; i++){
            mini = Math.min( mini , dp[i]);
        }
        return mini;
    }
   
}