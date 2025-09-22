// Last updated: 22/9/2025, 5:24:31 pm
class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return func( n , dp );
    }

    public int func( int n , int[] dp){
        if( n<=1) return n ;

        if( dp[n]!=-1) return dp[n];

        return dp[n] = func( n-1 , dp) + func( n-2 , dp);
    }
}