// Last updated: 21/1/2026, 3:34:20 pm
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n = text1.length() ;
4        int m = text2.length() ;
5
6        int dp[][] = new int[n+1][m+1] ;
7
8        for( int ele[] : dp ) Arrays.fill( ele , -1 );
9
10
11        return helper( text1, text2 , n-1 , m-1 , dp );
12    }
13
14    public int helper( String s1 , String s2 , int n , int m  , int[][] dp ){
15        if( n<0 || m<0 ){
16            return 0;
17        }
18
19        if( dp[n][m]!=-1 ) return dp[n][m] ;
20
21        if( s1.charAt(n) == s2.charAt(m) ){
22            return dp[n][m] = 1+ helper( s1 , s2 , n-1 , m-1 , dp);
23        }
24        return dp[n][m] = Math.max( helper( s1,s2,n-1,m , dp) , helper( s1,s2 , n , m-1 , dp) );
25    }
26}