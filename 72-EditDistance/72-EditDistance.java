// Last updated: 27/3/2026, 10:57:11 pm
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length();
4        int n = word2.length();
5
6        int dp[][] = new int[m+1][n+1];
7
8        // base cases
9        for (int i = 0; i <= m; i++) dp[i][0] = i; // delete all chars
10        for (int j = 0; j <= n; j++) dp[0][j] = j; // insert all chars
11        
12        for( int i =1 ; i<=m ; i++){
13            for( int j = 1 ; j<=n ; j++){
14                if( word1.charAt(i-1)==word2.charAt(j-1)){
15                    dp[i][j] = dp[i-1][j-1];
16                }
17                else{
18                    dp[i][j] =1 + Math.min( Math.min(dp[i-1][j],dp[i-1][j-1]) , dp[i][j-1]);
19                }
20            }
21        }
22        return dp[m][n];
23    }
24}