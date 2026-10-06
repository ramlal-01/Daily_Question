// Last updated: 6/10/2026, 7:22:22 pm
1class Solution {
2    public int minAddToMakeValid(String s) {
3        int n = s.length() ;
4
5        Stack<Character> st = new Stack<>() ;
6
7        
8        for( char c : s.toCharArray() ){
9            boolean flag = false ;
10            if( !st.isEmpty() && st.peek()=='(' && c==')' ){
11                st.pop();
12                flag = true;
13            }
14            if( !flag )st.push(c);
15        }
16
17        return st.size();
18    }
19}