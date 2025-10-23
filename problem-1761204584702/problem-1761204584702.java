// Last updated: 23/10/2025, 12:59:44 pm
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size() ;
        int n = m ;
        Integer dp[][] = new Integer[m][n];
        for( Integer ele[] : dp) Arrays.fill( ele , null);
        return helper( 0 , 0 , triangle , dp);

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