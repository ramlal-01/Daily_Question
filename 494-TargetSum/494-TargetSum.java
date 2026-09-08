// Last updated: 8/9/2026, 8:47:51 pm
1class Solution {
2    public int lastStoneWeightII(int[] stones) {
3        int n = stones.length ;
4        int sum = 0 ;
5        for( int ele : stones ) sum+=ele ;
6        int tot = sum ;
7        sum=sum/2 ;
8        boolean dp[][] = new boolean[n+1][sum+1] ;
9
10        for( int i = 0 ; i<=n ; i++ ) dp[i][0] = true ;
11
12        for( int i = 1 ; i<=n ; i++ ){
13            for( int j = 1 ; j<=sum ; j++ ){
14                dp[i][j] = dp[i-1][j] ;
15
16                if( stones[i-1] <= j ){
17                    dp[i][j] = dp[i][j] || dp[i-1][ j-stones[i-1] ] ;
18                }
19            }
20        }
21
22        for( int i = sum ; i>=0 ; i-- ){
23            if( dp[n][i] ) return tot - 2*i ;
24        }
25        return 0 ;
26    }
27}