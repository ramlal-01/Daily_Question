// Last updated: 20/9/2026, 10:21:26 am
1class Solution {
2    public int reverseDegree(String s) {
3        int n = s.length() ;
4        int sum = 0 ;
5        for( int i = 1 ; i<=n ; i++ ){
6            sum+= i * ( 26 -( s.charAt(i-1)-'a') );
7        }
8        return sum ;
9    }
10}