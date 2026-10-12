// Last updated: 12/10/2026, 11:33:18 am
1class Solution {
2    public String reverseVowels(String s) {
3        int n = s.length() ;
4
5        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U');
6        StringBuilder sb = new StringBuilder() ;
7
8        for( char c : s.toCharArray() ){
9            if( set.contains(c)){
10                sb.append(c);
11            }
12        }
13
14        sb.reverse();
15
16        StringBuilder res = new StringBuilder() ;
17
18        int i = 0 ;
19
20        for( char c : s.toCharArray() ){
21            if( set.contains(c)){
22                res.append(sb.charAt(i++));
23            }
24            else res.append(c);
25        }
26        return res.toString() ;
27    }
28}