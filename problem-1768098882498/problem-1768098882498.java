// Last updated: 11/1/2026, 8:04:42 am
1class Solution {
2    public int residuePrefixes(String s) {
3        Set<Character> set = new HashSet<>();
4        int c =0 ;
5        for( int i = 0 ; i<s.length() ; i++){
6            set.add( s.charAt(i) );
7            if( set.size() == (i+1)%3 ){
8                c++;
9            }
10        }
11        return c ;
12    }
13}