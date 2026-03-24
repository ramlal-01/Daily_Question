// Last updated: 24/3/2026, 12:19:56 pm
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int sum = 0;
4        for( int ele : nums){
5            sum+= ele;
6        }
7        if( sum%2!=0 ) return false;
8        return helper( nums.length , sum/2 , nums);
9    }
10
11    public boolean helper( int n , int k , int[] nums){
12        boolean dp[][] = new boolean[n+1][k+1] ;
13        
14        for( int i =0 ; i<n+1 ; i++ ){
15            dp[i][0] = true ;
16        }
17        for( int i =1 ; i<k+1 ; i++ ){
18            dp[0][i] = false ;
19        }
20        
21        for( int i =1 ; i<=n ; i++ ){
22            for( int j = 1 ; j<=k ; j++ ){
23                 
24                if( nums[i-1] <=j  ){
25                    dp[i][j] =  dp[i-1][j-nums[i-1]] ||  dp[i-1][j] ;
26                }
27                else dp[i][j] = dp[i-1][j] ;
28            }
29        }
30        
31        return dp[n][k] ;
32    }
33}