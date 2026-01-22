// Last updated: 23/1/2026, 5:16:45 am
1class Solution {
2    public boolean isSubsequence(String str1, String str2) {
3        int m = str1.length();
4        int n = str2.length();
5
6        int dp[][] = new int[m+1][n+1];
7
8        for( int i =1 ; i<=m ; i++){
9            for( int j = 1 ; j<=n ; j++){
10                if( str1.charAt(i-1)==str2.charAt(j-1)){
11                    dp[i][j] =1+ dp[i-1][j-1];
12                }
13                else{
14                    dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1]);
15                }
16            }
17        }
18
19        return dp[m][n]>=m ? true : false;
20    }
21}