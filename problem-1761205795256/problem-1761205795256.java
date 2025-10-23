// Last updated: 23/10/2025, 1:19:55 pm
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size() ;
        int n = m ;
        // Integer dp[][] = new Integer[m][n];
        // for( Integer ele[] : dp) Arrays.fill( ele , null);
        // return helper( 0 , 0 , triangle , dp);

        int dp[] = new int[n];
        for( int i = 0 ; i<n ; i++){
            dp[i] = triangle.get(n-1).get(i);
        }

        for( int i = n-2 ; i>=0  ; i--){
            int curr[] = new int[n];
            for( int j = i ; j>=0 ; j--){
                int down = triangle.get(i).get(j) + dp[j];
                int dia = triangle.get(i).get(j) + dp[j+1];
                curr[j] = Math.min( down , dia );
            }
            dp = curr;
        }
        return dp[0];

    }

    public int helper( int row , int col ,List<List<Integer>> list , Integer[][]dp){

        if( row==list.size()-1) return list.get(row).get(col);

        if( col>row || row<0 || col<0) return 0 ;

        if( dp[row][col]!=null) return dp[row][col];

        int down = list.get(row).get(col) + helper( row+1 , col , list ,dp);
        int dia =  list.get(row).get(col) + helper( row+1 , col+1 , list,dp);

        return dp[row][col] = Math.min( down , dia);
    }
}