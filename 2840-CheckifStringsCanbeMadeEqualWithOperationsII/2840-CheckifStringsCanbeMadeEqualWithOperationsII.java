// Last updated: 30/3/2026, 11:00:06 am
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int n = s1.length() ;
4        int m = s2.length() ;
5
6        if( n!=m ) return false ;
7
8        int map[] = new int[26] ;
9
10        for( int i = 0 ; i<n ; i++ ){
11            if( i%2==0 ){
12                map[ s1.charAt(i)-'a' ]++;
13
14                map[ s2.charAt(i)-'a' ]--;
15            }
16        }
17
18        for( int x : map ) if( x!=0 ) return false ;
19
20        for( int i = 0 ; i<n ; i++ ){
21            if( i%2!=0 ){
22                map[ s1.charAt(i)-'a' ]++;
23
24                map[ s2.charAt(i)-'a' ]--;
25            }
26        }
27
28        for( int x : map ) if( x!=0 ) return false ;
29
30        return true ;
31    }
32}