// Last updated: 17/5/2026, 9:58:39 pm
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        int n = s.length() ;
4
5        for( int i = 0 ; i<n-1 ; i++ ){
6            if( Math.abs( s.charAt(i)-s.charAt(i+1) ) > 2 ){
7                return false ;
8            }
9        }
10        return true ;
11    }
12}