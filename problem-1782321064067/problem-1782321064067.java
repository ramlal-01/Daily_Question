// Last updated: 24/6/2026, 10:41:04 pm
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        long sum  = 0 ;
4
5        int l = Math.max( 1 , n-k ) ;
6        int h = n+k ; 
7
8        for( int i = l ; i<=h ; i++  ){
9            if( (n&i) == 0  ) sum+= i ; 
10        }
11
12        return (int)sum ;
13    }
14}