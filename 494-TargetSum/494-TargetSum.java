// Last updated: 8/9/2026, 2:29:49 pm
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        int n = nums.length ; 
4        int sum = 0 ;
5        for( int ele : nums ) sum+=ele ;
6
7        if ((sum + target) % 2 != 0) {
8            return 0;
9        }
10        if( Math.abs(target)>sum ) return 0 ;
11
12        sum = ( sum+target)/2 ;
13
14        int dp[][] = new int[n+1][sum+1] ;
15
16        dp[0][0] = 1 ;
17
18        for( int i = 1 ; i<=n ; i++ ){
19            for( int j = 0; j<=sum ; j++ ){
20                dp[i][j] = dp[i-1][j] ;
21
22                if( nums[i-1] <= j ){
23                    dp[i][j] = dp[i][j] + dp[i-1][j-nums[i-1]] ;
24                }
25            }
26        }
27
28        return dp[n][sum] ;
29    }
30}