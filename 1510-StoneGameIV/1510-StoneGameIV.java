// Last updated: 10/8/2026, 1:24:27 pm
1class Solution {
2    public boolean winnerSquareGame(int n) {
3        Boolean dp[] = new Boolean[n+1] ;
4
5        List<Integer> list = new ArrayList<>() ;
6        for( int i = 1 ; i*i<=n ; i++ ){
7            
8                list.add( i*i );
9            
10        }
11
12        return helper( n , dp , list ) ;
13    }
14    public boolean helper( int n , Boolean dp[] , List<Integer> list){
15        if(dp[n]!=null) return dp[n] ;
16
17        for( int i : list ){
18            if( n==i ) return dp[n] = true ;
19            else if( i<n ){
20                if( !helper( n-i, dp , list ) ) return dp[n] = true;
21            }
22            else break ;
23        }
24        return dp[n] = false ;
25    } 
26}