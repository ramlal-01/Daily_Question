// Last updated: 18/1/2026, 8:03:59 am
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v = 0 ;
4        int c= 0 ;
5
6        for( char ch : s.toCharArray()){
7            if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
8                v++;
9            }
10            else {
11                if( ch>='a' && ch<='z'){
12                    c++;
13                }
14            }
15        }
16        int score = 0 ;
17        if( c>0){
18            score = (int)Math.floor(v/c);
19            return score;
20        }
21        return score;
22    }
23}