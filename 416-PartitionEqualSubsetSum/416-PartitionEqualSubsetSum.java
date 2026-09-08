// Last updated: 8/9/2026, 1:48:19 pm
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0 ;
4        int n = nums.length ;
5        for( int ele : nums ) sum+=ele ;
6
7        if( sum%2!=0 ) return false ;
8
9        sum = sum/2 ; 
10
11        Boolean dp[][] = new Boolean[n+1][sum+1] ;
12
13        for( int i = 0 ; i<=n ; i++ ) dp[i][0] = true ;
14        for ( int j = 1 ; j<=sum ; j++ ) dp[0][j] = false ;
15
16        for( int i = 1 ; i<=n ; i++ ){
17            for( int j = 1; j<=sum ; j++ ){
18                dp[i][j] = dp[i-1][j] ;
19
20                if( nums[i-1] <= j ){
21                    dp[i][j] = dp[i][j] || dp[i-1][j-nums[i-1]] ;
22                }
23            }
24        }
25        return dp[n][sum] ;
26    }
27}