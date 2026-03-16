// Last updated: 16/3/2026, 11:11:25 am
1class Solution {
2    public int firstUniqChar(String s) {
3        int map[] = new int[26] ;
4
5        for( char c : s.toCharArray() ){
6            map[ c-'a' ]++ ;
7        }
8
9        for( int i = 0 ; i<s.length(); i++ ){
10            if( map[ s.charAt(i)-'a' ]==1 ){
11                return i ;
12            }
13        }
14        return -1 ;
15    }
16}