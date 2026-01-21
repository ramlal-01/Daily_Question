// Last updated: 21/1/2026, 3:12:34 pm
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n = text1.length() ;
4        int m = text2.length() ;
5
6        int dp[][] = new int[n+1][m+1] ;
7
8        for( int i =0 ; i<m ; i++){
9            dp[0][i] = 0 ;
10        }
11
12        for( int i =0 ;i<n ; i++){
13            dp[i][0] = 0 ;
14        }
15
16        for( int i =1 ; i<=n ; i++){
17            for( int j = 1 ; j<=m ; j++){
18                if( text1.charAt(i-1)==( text2.charAt(j-1) ) ){
19                    dp[i][j] = 1+dp[i-1][j-1];
20                }
21                else {
22                    dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
23                }
24
25            }
26        }
27        return dp[n][m] ;
28    }
29}