// Last updated: 19/8/2026, 10:16:10 pm
1class Solution {
2    public int climbStairs(int n) {
3        if( n<=2 ) return n ;
4
5        int prev1 =1  , prev = 2 ;
6        int curr = 1 ;
7        for( int i =3 ; i<=n ; i++ ){
8            curr = prev1 + prev ; 
9            prev1= prev ;
10            prev = curr ;
11        }
12        return curr ;
13    }
14}