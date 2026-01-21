// Last updated: 21/1/2026, 2:18:18 pm
1class Solution {
2    public String makeGood(String s) {
3        Stack<Character> st = new Stack<>() ;
4
5        int n = s.length();
6
7        for( int i =0 ; i<n ; i++ ){
8            if( !st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==32 ){
9                st.pop();
10                
11            }
12            else st.push( s.charAt(i) );
13            
14        }
15
16        StringBuilder sb = new StringBuilder();
17        while( !st.isEmpty() ){
18            sb.append(st.peek() );
19            st.pop();
20        }
21        sb.reverse();
22
23        return sb.toString();
24    }
25}