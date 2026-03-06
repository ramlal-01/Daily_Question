// Last updated: 6/3/2026, 12:28:52 pm
1class Solution {
2    public int minOperations(String s) {
3        int flag = 0 ;
4        
5        int c = 0 ;
6        for( char ch : s.toCharArray()){
7            if( ch-'0' != flag ){
8                c++;
9            }
10            flag = 1-flag ;
11        }
12
13        flag = 1 ;
14        int cnt = 0 ;
15        for( char ch : s.toCharArray()){
16            if( ch-'0' != flag ){
17                cnt++;
18            }
19            flag = 1-flag ;
20        }
21        return Math.min( c , cnt ) ;
22    }
23}