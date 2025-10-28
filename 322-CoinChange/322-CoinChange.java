// Last updated: 28/10/2025, 11:02:52 am
class Solution {
    public int coinChange(int[] coins, int amount) {
        int m = coins.length ;
        int n = amount + 1 ;

        int dp[] = new int[n];
        int max  = n ;

        Arrays.fill( dp , max);

        dp[0] = 0 ;
        
        for( int i=0 ; i<m ; i++){
            // backward  for bounded knapsack
            for( int j = coins[i] ; j<= amount ; j++ ){
                dp[j] = Math.min( dp[j] , 1 +  dp[j - coins[i]] );
                
            }

            
        }
        
        return dp[amount]==max ? -1 : dp[amount];
    }
}