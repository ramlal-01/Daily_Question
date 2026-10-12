// Last updated: 12/10/2026, 1:10:26 pm
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int n = s.length() ;
4        int m = t.length() ;
5
6        int i = 0 ,j = 0 ;
7
8        while( i<n && j<m ){
9            if( s.charAt(i) == t.charAt(j) ){
10                i++;
11            }
12            j++;
13        }
14        return i==n ; 
15    }
16}