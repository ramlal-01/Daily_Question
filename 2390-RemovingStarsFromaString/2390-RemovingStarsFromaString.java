// Last updated: 12/10/2026, 3:16:56 pm
1class Solution {
2    public String removeStars(String s) {
3        ArrayDeque<Character> st = new ArrayDeque<>();
4        int n = s.length();
5        for( int i=0 ; i<n ; i++){
6            if( !st.isEmpty() && s.charAt(i)=='*'){
7                st.pop();
8            }
9            else{
10                st.push(s.charAt(i));
11            }
12            
13        }
14        StringBuilder sb = new StringBuilder();
15        while(!st.isEmpty()){
16            sb.append(st.pop());
17        }
18        return sb.reverse().toString();
19    }
20}