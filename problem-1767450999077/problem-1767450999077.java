// Last updated: 3/1/2026, 8:06:39 pm
1class Solution {
2    public String reversePrefix(String s, int k) {
3        String st= new StringBuilder( s.substring(0,k)).reverse().toString();
4
5
6        String res = st+ s.substring(k) ;
7
8        return res ;
9        
10    }
11}