// Last updated: 26/3/2026, 10:53:43 am
1class Solution {
2    public int change(int amount, int[] coins) {
3        int n = coins.length ;
4        int dp[][] = new int[n+1][amount+1] ;
5
6        dp[0][0] = 1 ;
7
8        for( int i = 1 ; i<=n ; i++ ){
9            for( int j = 0 ; j<=amount ; j++ ){
10                if( coins[i-1]<=j ){
11                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j] ;
12                }
13                else dp[i][j] = dp[i-1][j] ;
14            }
15        }
16        return dp[n][amount] ;
17    }
18}