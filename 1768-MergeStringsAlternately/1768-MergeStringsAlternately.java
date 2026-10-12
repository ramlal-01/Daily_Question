// Last updated: 12/10/2026, 10:18:40 am
1class Solution {
2    public String mergeAlternately(String word1, String word2) {
3        int n = word1.length() ;
4        int m = word2.length() ;
5
6        int i = 0 ;
7        int j = 0 ;
8
9        StringBuilder sb = new StringBuilder() ;
10
11        while( i<n && j<m ){
12            sb.append( word1.charAt(i) );
13            sb.append( word2.charAt(j) );
14            i++;
15            j++;
16        }
17
18        while( i<n ){
19            sb.append( word1.charAt(i) );
20            i++;
21        }
22        while( j<m ){
23            sb.append( word2.charAt(j) );
24            j++;
25        }
26
27        return sb.toString() ;
28    }
29}