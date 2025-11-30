// Last updated: 30/11/2025, 8:31:57 am
1class Solution {
2    public int maxDistinct(String s) {
3        boolean map[] = new boolean[26];
4        int c = 0 ;
5
6        for( int i = 0 ; i<s.length(); i++ ){
7            char ch = s.charAt(i);
8            if( !map[ch-'a']){
9                //System.out.println();
10                map[ch-'a'] = true ;
11                c++;
12            }
13        }
14        return c ;
15    }
16}