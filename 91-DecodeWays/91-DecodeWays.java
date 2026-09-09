// Last updated: 9/9/2026, 3:50:45 pm
1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length() ;
4
5        int dp[] = new int[n+1] ;
6
7        dp[0] = 1 ;
8
9        if( s.charAt(0)!='0' ) dp[1] = 1 ;
10
11        for( int i = 2 ; i<=n ; i++ ){
12            
13            if( s.charAt(i-1)!='0') dp[i] = dp[i-1] ;
14
15            int no = Integer.parseInt( s.substring(i-2,i) ) ;
16            
17            if( no>=10 && no<=26) dp[i]+=dp[i-2] ;
18        }
19
20        return dp[n] ;
21    }
22}