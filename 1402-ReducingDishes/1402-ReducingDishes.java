// Last updated: 12/9/2026, 9:54:10 am
1class Solution {
2    Integer dp[][] ;
3    public int maxSatisfaction(int[] arr) {
4        int n = arr.length ;
5        Arrays.sort(arr) ;
6
7        dp = new Integer[n+1][n+1] ;
8
9        return helper( 0 , arr , 1 ) ;
10    }
11
12    public int helper( int ind , int[] arr  , int count ){
13        if( ind>arr.length-1 ){
14            return 0 ;
15        }
16
17        if( dp[ind][count]!=null ) return dp[ind][count] ;
18
19        int pick = helper( ind+1 , arr  , count+1 ) + (count * arr[ind]);
20        
21        int skip = helper( ind+1 , arr , count) ;
22
23        return dp[ind][count] = Math.max(pick , skip ) ;
24    }
25}