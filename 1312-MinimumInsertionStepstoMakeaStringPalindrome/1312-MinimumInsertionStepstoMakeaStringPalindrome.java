// Last updated: 22/1/2026, 11:35:16 am
1class Solution {
2    public int minInsertions(String s) {
3        String s1 = new StringBuilder(s).reverse().toString();
4
5        int n = s.length() ;
6
7        int dp[][] = new int[n+1][n+1] ;
8
9        for( int i=0; i<=n ;i++){
10            dp[i][n] = 0;
11        }
12        for( int i =0 ;i<=n ; i++){
13            dp[n][i] = 0;
14        }
15
16        for( int i=1;i<=n ;i++){
17            for( int j =1 ; j<=n ; j++){
18                if(s.charAt(i-1) == s1.charAt(j-1) ){
19                    dp[i][j] = 1+ dp[i-1][j-1];
20                }
21                else dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
22            }
23        }
24
25        return s.length() - dp[n][n] ;
26    }
27}