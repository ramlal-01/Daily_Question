// Last updated: 29/6/2026, 8:53:26 am
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int n = patterns.length ; 
4
5        int c = 0 ;
6        for( int i = 0 ; i<n ; i++ ){
7            if( word.contains( patterns[i] ) ) c++ ;
8        }
9
10        return c ; 
11    }
12}