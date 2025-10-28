// Last updated: 28/10/2025, 10:38:59 am
class Solution {
    public int change(int amount, int[] coins) {
        int m = coins.length ;
        int n = amount + 1 ;

        int dp[] = new int[n];
         
        dp[0] = 1 ;
        
        for( int i=0 ; i<m ; i++){
            // backward  for bounded knapsack
            for( int j = coins[i] ; j<= amount ; j++ ){
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        
        return dp[amount];
    }
}