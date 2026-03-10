// Last updated: 10/3/2026, 2:56:06 pm
1class Solution {
2    public String minWindow(String s, String t) {
3        int n = s.length() ;
4        int m = t.length() ;
5        if( n<m ) return "" ;
6
7        int map[] = new int[256] ;
8        for( char c : t.toCharArray() ){
9            map[c]++;
10        }
11
12        int left = 0 ;
13        int minLen = Integer.MAX_VALUE ;
14        int start  = 0 ;
15        int count = m ;
16
17        for( int right = 0 ; right<n ; right++ ){
18            if( map[s.charAt(right)] > 0 ){
19                count--;
20            }
21            map[s.charAt(right)]--;
22            while( count==0 ){
23                if( minLen> right-left+1 ){
24                    minLen = right -left+1 ;
25                    start = left ;
26                }
27                map[s.charAt(left)]++;
28
29                if( map[s.charAt(left)]>0 ){
30                    count++;
31                }
32                left++;
33            }
34        }
35
36        return minLen==Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
37    }
38}