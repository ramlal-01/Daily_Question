// Last updated: 9/9/2026, 2:52:16 am
1class Solution {
2    public int change(int amount, int[] coins) {
3        int n = coins.length ; 
4
5        int dp[][] = new int[n+1][amount+1] ;
6
7        for( int i = 1; i<=n ; i++ ) dp[i][0] = 1 ;
8
9        for( int i = 1 ; i<=n ; i++ ){
10            for( int j = 1; j<=amount ; j++ ){
11                dp[i][j] = dp[i-1][j] ;
12
13                if( coins[i-1]<= j ){
14                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
15                }
16            }
17        }
18        return dp[n][amount] ;
19    }
20}