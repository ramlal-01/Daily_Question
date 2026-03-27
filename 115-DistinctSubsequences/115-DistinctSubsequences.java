// Last updated: 27/3/2026, 10:59:58 pm
1class Solution {
2    public int numDistinct(String s, String t) {
3        int dp[][] = new int[s.length()+1][t.length()+1];
4        for( int el[] : dp ) Arrays.fill( el , -1 );
5
6        return helper(s,t, s.length() , t.length() , dp);
7    }
8
9    public int helper( String s, String t , int i , int j , int[][] dp){
10        if( j==0) return 1 ;
11        if( i==0) return 0 ;
12
13        if( dp[i][j]!=-1) return dp[i][j];
14
15        if( s.charAt(i-1)==t.charAt(j-1)){
16            return dp[i][j] = helper(s,t, i-1,j-1 ,dp) + helper(s,t,i-1,j , dp);
17        }
18
19        return dp[i][j] = helper(s,t,i-1,j , dp);
20    }
21}