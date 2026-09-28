// Last updated: 28/9/2026, 12:49:37 pm
1class Solution {
2    public int maxDepth(String s) {
3        int n = s.length() ;
4        int a = 0 ; 
5        int maxi = 0 ;
6
7        for( char c : s.toCharArray() ){
8            if( c=='(') a++;
9            maxi = Math.max( a,maxi);
10            if( c==')') a-- ;
11        }
12
13        return maxi ;
14    }
15}