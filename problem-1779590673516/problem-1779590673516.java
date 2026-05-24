// Last updated: 24/5/2026, 8:14:33 am
1class Solution {
2    public int passwordStrength(String pass) {
3        int ans = 0 ;
4        Set<Character> set = new HashSet<>() ;
5        for( char ch : pass.toCharArray() ){
6            if( !set.contains(ch) ){
7                set.add(ch);
8
9                if( ch >='a' && ch<='z') ans++;
10                else if( ch>='0' && ch<='9' ) ans+=3 ;
11                else if( ch>='A' && ch<='Z' ) ans+=2 ;
12                else if( ch=='!' || ch=='@' || ch=='#' || ch=='$' ) ans+=5 ;
13            }
14        }
15        return ans;
16    }
17}