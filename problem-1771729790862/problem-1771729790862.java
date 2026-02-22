// Last updated: 22/2/2026, 8:39:50 am
1class Solution {
2    public String maximumXor(String s, String t) {
3        int one = 0 ;
4        int zero = 0 ;
5
6        for( char c : t.toCharArray()){
7            if( c=='0') zero++;
8            else one++;
9        }
10
11        StringBuilder sb = new StringBuilder() ;
12        for( int i=0 ; i<s.length() ; i++ ){
13            if( s.charAt(i)=='0' ){
14                if( one >0 ){
15                    sb.append(1);
16                    one--;
17                }
18                else sb.append(0);
19            }
20            else{
21                if( zero>0 ){
22                    sb.append(0);
23                    zero--;
24                }
25                else sb.append(1);
26            }
27        }
28        StringBuilder res = new StringBuilder() ;
29
30        int i = 0 ;
31        while( i<s.length() ){
32            if( s.charAt(i)==sb.charAt(i)){
33                res.append(0);
34            }
35            else res.append(1);
36
37            i++;
38        }
39        return res.toString();
40    }
41}