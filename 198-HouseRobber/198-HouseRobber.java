// Last updated: 9/9/2026, 1:30:41 pm
1class Solution {
2    public int rob(int[] nums) {
3        int n = nums.length ;
4        int dp[] = new int[n] ;
5
6        if( n==1 ) return nums[0] ;
7        if( n==2 ) return Math.max( nums[0] , nums[1] );
8
9        dp[0] = nums[0] ;
10        dp[1] = Math.max( nums[0] , nums[1] );
11
12        for( int i =2 ; i<n ; i++ ){
13            dp[i] = Math.max( dp[i-1] , nums[i]+dp[i-2] ) ;
14        }
15
16        return dp[n-1] ;
17    }
18}