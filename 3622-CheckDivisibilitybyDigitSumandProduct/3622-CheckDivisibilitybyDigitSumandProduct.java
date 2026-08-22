// Last updated: 22/8/2026, 9:39:51 pm
1class Solution {
2    public boolean checkDivisibility(int n) {
3        String s = String.valueOf(n) ;
4        int sum=0 ;
5        int prod = 1 ;
6        for( char c : s.toCharArray()){
7            sum+= c-'0' ;
8            prod*=c-'0' ;
9        }
10
11        return n%( sum+prod)==0;
12    }
13}