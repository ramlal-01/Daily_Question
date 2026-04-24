// Last updated: 24/4/2026, 6:34:10 pm
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int l = 0 , r=0 , s = 0 ;
4        for( char c : moves.toCharArray() ){
5            if( c=='L') l++;
6            if( c=='R' ) r++;
7            if( c=='_') s++;
8        }
9
10        if( l>= r ) return l+s-r ;
11        else return r+s-l ;
12    }
13}