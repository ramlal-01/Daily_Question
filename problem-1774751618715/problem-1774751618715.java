// Last updated: 29/3/2026, 8:03:38 am
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int n = s.length() ;
4        int i = 0 ;
5        int j = n-1 ;
6
7        while( i<=j ){
8            if( s.charAt(i)==s.charAt(j) ){
9                return i ;
10            }
11            i++;
12            j--;
13        }
14        return -1 ;
15    }
16}