// Last updated: 21/1/2026, 2:30:29 pm
1class Solution {
2    public int minLength(String s) {
3        Stack<Character> st = new Stack<>() ;
4
5        int n = s.length();
6
7        for( int i =0 ; i<n ; i++ ){
8            if( !st.isEmpty() && st.peek()=='A' && s.charAt(i)=='B' ){
9                st.pop();
10                
11            }
12            else if( !st.isEmpty() && st.peek()=='C' && s.charAt(i)=='D' ){
13                st.pop();
14            }
15            else st.push( s.charAt(i) );
16            
17        }
18
19       
20
21        return st.size() ;
22    }
23}